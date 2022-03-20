package EasyProblems.day5;

public class ReverseInteger {
    /**
     *  PROBLEM LINK:https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/
     *  STATUS: ACCEPTED
     *  HELP ? NO
     *  NUM OF SUBMISSIONS ? 2
     *


     MY SOLUTION, BAD PEFORMANCE
    public static int reverse(Integer num) {

        char[] s = num.toString().toCharArray();

        int i = s[0] == '-' ? 1 : 0;
        int j = s.length - 1;

        while(i <= j){
            swap(s, i,j);
            i++;
            j--;
        }

        String s1 = String.valueOf(s);

        try {
            return Integer.valueOf(s1);
        }catch (NumberFormatException e){
            return 0;
        }
    }

    private static void swap(char[] s, int i, int j) {

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

     */

    // Better Solution
    public static int reverse(int x) {

        boolean negative = false;

        if(x < 0 ){
            negative = true;
            x *= -1;
        }
//tele:966 582 099 989
        long ans = 0;

        while(x > 0){
            ans = (ans * 10) + (x % 10);
            x /= 10;
        }

        if(ans > Integer.MAX_VALUE) return 0;

        return negative ? (int)( - 1 * ans) : (int) ans;
    }

    public static void main(String[] args) {
        int x =  -123;

        System.out.println(reverse(x));
    }
}
