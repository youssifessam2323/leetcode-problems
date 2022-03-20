package EasyProblems.day6;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {

        s = s.replace(" ", "");
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < sb.length(); i++){
            if(!Character.isLetterOrDigit(sb.charAt(i))){
                sb.deleteCharAt(i);
                i-=1;
                continue;
            }
            if(!Character.isLowerCase(sb.charAt(i))){
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
        }
        int j = 0, k = sb.length() - 1;

        while(j < k){
            if(sb.charAt(j) != sb.charAt(k))
                return false;
            j++;k--;
        }
        return true;
    }

    public static int myAtoi(String s) {

        boolean isNegative = false;
        long result = 0;

        for(int i = 0; i < s.length(); i++){


            if(Character.isLetter(s.charAt(i)) || Character.getType(s.charAt(i)) == Character.OTHER_PUNCTUATION){
                return (int)result;
            }

            if(s.charAt(i) == '-' || s.charAt(i) == '+'){
                isNegative = s.charAt(i) == '-';
                continue;
            }

            if(Character.isWhitespace(s.charAt(i))){
                continue;
            }

            int i1 = Integer.parseInt(String.valueOf(s.charAt(i)));

            if((result * 10 + i1) > Integer.MAX_VALUE ){
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }



            result = result * 10 + i1;


        }
        return (int)(isNegative ? result * -1 : result);
    }
    public static void main(String[] args) {
//        String s = "ab_a";
//        System.out.println(isPalindrome(s));
        String s = "3.14159";

        System.out.println(myAtoi(s));
//        System.out.println(Character.getType('.'));
    }
}
