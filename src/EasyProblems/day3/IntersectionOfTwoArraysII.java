package EasyProblems.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysII {


    /**
     *  PROBLEM LINK:https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
     *  STATUS: ACCEPTED
     *  HELP ? NO
     *  NUM OF SUBMISSIONS ? 2
     *
     */


    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        int resIndex = 0;

        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);

            } else {
                map.put(num, 1);
            }
        }

        System.out.println(map);
        // Map => {1:2, 2:2}

        for (int num : nums2) {
            if (map.containsKey(num)) {

                res.add(num);
                Integer value = map.get(num);

                map.put(num, value - 1);


                if(value - 1 == 0) {
                    map.remove(num);
                }
            }
        }

        System.out.println(map);
        int[] arr = new int[res.size()];
        for (Integer e:
             res) {

            arr[resIndex++] = e;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};

        Arrays.stream(intersect(arr1,arr2)).forEach(System.out::println);
    }
}
