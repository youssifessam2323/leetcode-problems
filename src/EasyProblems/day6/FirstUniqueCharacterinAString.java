package EasyProblems.day6;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterinAString {

    /**
     *  PROBLEM LINK:https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
     *  STATUS: ACCEPTED
     *  HELP ? NO
     *  NUM OF SUBMISSIONS ? 1
     *
     */

    public static int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                 map.put(s.charAt(i),-1);
            }else{
                map.put(s.charAt(i), i);
            }
        }

        int min = Integer.MAX_VALUE;

        for(var row : map.entrySet()){
            if(row.getValue() == -1)
                continue;

            if(row.getValue() < min)
                min = row.getValue();
        }


        return min == Integer.MAX_VALUE ? -1 : min;
    }


    public static void main(String[] args) {
        String s = "loveleetcode";

        System.out.println(firstUniqChar(s));
    }
}
