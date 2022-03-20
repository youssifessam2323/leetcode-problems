package EasyProblems.day6;

import java.util.Arrays;

public class ValidAnagram {

    /**
     *  PROBLEM LINK:https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
     *  STATUS: ACCEPTED
     *  HELP ? NO
     *  NUM OF SUBMISSIONS ? 1
     *
     */

    public static boolean isAnagram(String s, String t) {

        var sArr = s.toCharArray();
        var tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        if(sArr.length != tArr.length){
            return false;
        }

        for (int i = 0; i < sArr.length; i++) {
            if(sArr[i] != tArr[i])
                return false;
        }

        return true;
    }


    public static void main(String[] args) {
        String s = "rat", t = "car";
        System.out.println(isAnagram(s, t));
    }
}
