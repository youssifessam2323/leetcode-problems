package EasyProblems.day2;

import java.util.Arrays;

public class SingleNumber {

/**
 *  PROBLEM LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
 *  STATUS:
 *  HELP ?
 *  NUM OF SUBMISSIONS ?
 *
 */

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        if(nums.length == 1) return nums[0];
        for (int i = 0; i < nums.length; i++) {

           if(i == 0 || i == nums.length - 1){
               if(i == 0 && nums[i] != nums[i + 1]){
                   return nums[i];
               }
               if( i == nums.length - 1 && nums[i] != nums[i - 1] ){
                   return nums[i];
               }
           }else {
               if(nums[i] != nums[i-1] && nums[i] != nums[i + 1] ){
                   return nums[i];
               }
           }



        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1}));
    }


}
