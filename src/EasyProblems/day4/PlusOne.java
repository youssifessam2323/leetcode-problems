package EasyProblems.day4;

import java.util.Arrays;

public class PlusOne {

    /**
     *  PROBLEM LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
     *  STATUS: ACCEPTED
     *  HELP ? NO
     *  NUM OF SUBMISSIONS ? 1
     *
     */

    public static int[] plusOne(int[] digits) {

        int i = digits.length - 1;
        boolean isLarger = false;

        while(i >= 0){

            if(digits[i] == 9) {
                digits[i] = 0;
                --i;

                if(i >= 0 && digits[i] != 9){
                    digits[i] = digits[i] + 1;
                    i--;
                    break;
                }
            }else {
                digits[i] = digits[i]+ 1;
                break;
            }
        }

        if(digits[0] == 0) {
            isLarger = true;
        }

        int[] res = new int[isLarger ? digits.length + 1 : digits.length];

        for (int k = digits.length - 1; k >= 0; k--) {
            if(isLarger)
                res[k+1] = digits[k];
            else {
                res[k] = digits[k];
            }
        }


        if(isLarger){
            res[0] = 1;
        }
        return res;
    }


    public static void main(String[] args) {
        int [] arr = {8,8,8};

        Arrays.stream(plusOne(arr)).forEach(System.out::print);
    }

}
