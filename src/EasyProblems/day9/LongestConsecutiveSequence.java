package EasyProblems.day9;

import java.util.*;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        int maxSequence = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int currentEle = nums[i];
            int currSequenceLength = 0;
            while(set.contains(currentEle) ){
                currentEle +=1;
                currSequenceLength +=1;
            }
            maxSequence = Math.max(maxSequence, currSequenceLength);
        }
        return maxSequence;
    }


    public static void main(String[] args) {
        LongestConsecutiveSequence demo = new LongestConsecutiveSequence() ;
        System.out.println(demo.longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
