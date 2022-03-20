package EasyProblems.day7;

public class LongestPrefix {

    public static String longestCommonPrefix(String[] strs) {

        String longestPrefix = strs[0];

        for(int i = 1; i < strs.length; i++){

            int j = 0;

            while((j < strs[i].length()  && j < longestPrefix.length()) && longestPrefix.charAt(j) == strs[i].charAt(j)){
                j++;
            }
            longestPrefix = longestPrefix.length() == j ? longestPrefix : strs[i].substring(0,j );
        }

        return longestPrefix;
    }


    public static void main(String[] args) {
        String[] strs = {"flower","f", "f" };
        System.out.println(longestCommonPrefix(strs));
    }
}
