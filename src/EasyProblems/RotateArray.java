package EasyProblems;

import java.util.Arrays;


/**
 *  STATUS: REJECTED
 *  HELP ? YES
 *  NUM OF SUBMISSIONS ? 5+
 *
 */


public class RotateArray {

    public static void rotate(int[] nums, int k) {
        if(k == 0 || k > nums.length)
            return;

        reverse(0,nums.length - 1,nums); // reverse the original array
        reverse(0,k - 1,nums);
        reverse(k ,nums.length - 1,nums);
        Arrays.stream(nums).forEach(System.out::print);
    }

    private static void reverse(int start, int end, int[] reversedNums) {

        int mid = start + (end - start) / 2;
        //l+ (r-l)/2;
        while( start <=mid &&  end != mid) {
            swap(start, end, reversedNums);
            start++;
            end--;
        }
    }

    private static void swap(int start, int end, int[] arr) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        rotate(new int[]{1,2}, 2);

    }
}
