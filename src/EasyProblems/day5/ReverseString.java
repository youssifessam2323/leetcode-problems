package EasyProblems.day5;

public class ReverseString {

    /**
     *  PROBLEM LINK:https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
     *  STATUS: ACCEPTED
     *  HELP ? NO
     *  NUM OF SUBMISSIONS ? 1
     *
     */

    public static void reverseString(char[] s) {

        int i = 0, j = s.length - 1;

        while(i <= j){
            swap(s, i,j);
            i++;
            j--;
        }
    }

    private static void swap(char[] s, int i, int j) {

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }


    public static void main(String[] args) {
        String s = "Helose";
        char[] chars = s.toCharArray();
        reverseString(chars);

        System.out.println(chars);
    }
}
