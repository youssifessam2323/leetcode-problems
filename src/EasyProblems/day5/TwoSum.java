package EasyProblems.day5;

import java.util.Arrays;

public class TwoSum {
    /**
     *  PROBLEM LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
     *  STATUS: NOT ACCEPTED, REASON: I tried to solve it without using hashmap
     *  HELP ?
     *  NUM OF SUBMISSIONS ? 3
     *
     */

    public static int[] twoSum(int[] nums, int target) {

        int i = 0, j = nums.length - 1;

        while(i <= j){
            if(nums[i] + nums[j] < target){
                if(nums[i + 1] > nums[j - 1])
                    i++;
                else
                    j--;
            }else if(nums[i] + nums[j] > target && nums[i + 1] < nums[j - 1]) {


            }else if(nums[i] + nums[j] > target){

                if(nums[i + 1] < nums[j - 1])
                    j--;
                else if(nums[i + 1] == nums[j - 1]) {
                    return nums[i + 1] + nums[i] == target ?
                            new int[]{i, i+1}
                            :
                            new int[] {j - 1, j};
                }
            }else {
                return new int[]{i,j};
            }
        }
        return null;
    }

    public static void main(String[] args) {
//        int[] arr = {2,7,11,15};
        int[] arr = {2,5,5,11};
//        int[] arr = {3,2,4};


        Arrays.stream(twoSum(arr, 10)).forEach(System.out::print);
    }
}
