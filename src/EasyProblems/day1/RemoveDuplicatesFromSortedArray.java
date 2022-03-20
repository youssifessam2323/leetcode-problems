package EasyProblems.day1;


/**
 *  PROBLEM LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 *  STATUS: ACCEPTED
 *  HELP ? YES
 *  NUM OF SUBMISSIONS ? 2
 *
 */

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
                    int index = 1;

                    for (int i = 0; i < nums.length -1; i++) {
                        if(nums[i] != nums[i + 1]){
                            nums[index++] = nums[i];
            }
        }

        return index;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1,1,1,1,1,1,2,2,3,3,4,4,4,5};
        System.out.println(removeDuplicates(arr));
    }
}
