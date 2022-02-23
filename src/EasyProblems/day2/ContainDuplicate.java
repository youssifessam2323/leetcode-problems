package EasyProblems.day2;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicate {

    /**
     *  PROBLEM LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
     *  STATUS: ACCEPTED
     *  HELP ? NO
     *  NUM OF SUBMISSIONS ? 1
     *
     */

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> dup = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(dup.containsKey(nums[i]))
                return true;

            dup.put(nums[i],0);
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5, 1}));
    }
}
