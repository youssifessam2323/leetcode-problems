package EasyProblems.day7;

public class StrStr {
    /**
     *  PROBLEM LINK:https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
     *  STATUS: ACCEPTED
     *  HELP ? YES
     *  NUM OF SUBMISSIONS ? 1
     *
     */

    public static int strStr(String haystack, String needle) {



        int m = haystack.length();
        int n = needle.length();


        if(n > m )
            return -1;

        /**
         *  haystack => lalalalac => len= 9
         *  needle => lac  => len = 3
         *
         *
         */

        for (int i = 0; i <= m - n; i++) {
            int j = 0 ;

            while( j < n && needle.charAt(j) == haystack.charAt(i + j) ){
                j++;
            }

            if(j == n){
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        System.out.println(strStr("lalalalaac", "lac"));
    }
}
