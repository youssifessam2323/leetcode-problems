package EasyProblems.day4;

import java.util.Arrays;

public class MoveZeros {
    /**
     *  PROBLEM LINK:https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
     *  STATUS: ACCEPTED
     *  HELP ? YES
     *  NUM OF SUBMISSIONS ? 2
     *
     */


    /*

    OLD ANSWER, REASON => inefficient, unreadable
    public static void moveZeroes(int[] nums) {

        int i = 0, j = 0 ;
        boolean isZero = false;

        while(i < nums.length && j < nums.length){

            if(nums[j] == 0){
                isZero = true;
            }else {
                isZero = false;
            }

            if(nums[j] == 0 && nums[i] != 0){
                swap(nums,i,j);
                isZero = false;

            }

            if(isZero == false){
                j++;
            }
            i++;

        }

        Arrays.stream(nums).forEach(System.out::print);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
    */

    public static void moveZeroes(int[] nums) {

        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0)
                nums[idx++] = nums[i];
        }

        for (; idx < nums.length; idx++) {
            nums[idx] = 0 ;
        }
        Arrays.stream(nums).forEach(System.out::print);


    }


    public static void main(String[] args) {
        int[] arr = {0,0,1};
        moveZeroes(arr);
    }
}
