package EasyProblems.day15;
/**
 *  PROBLEM LINK:
 *  STATUS:
 *  HELP ?
 *  NUM OF SUBMISSIONS ?
 *  TRICK LEARNED FROM IT?
 *  POINT OF FAILURE(SOLUTION, IMPLEMENTATION, LACK OF TECHNIQUE)? Implementation
 */


public class FindBadVersion {
 
    boolean isBadVersion(int version){
        if(version >= 4) return true;

        return false;
    }

    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while(left < right){
            int mid = left + (right - left) / 2; 
            if(!isBadVersion(mid)){
                left = mid + 1;
            }else {
                right = mid;
            }
        }

        return left;
    }
    
    // private int findBadVersionHelper(int start, int end){
        // int middle =  start + (end - start) / 2;
        
    // }

    public static void main(String[] args) {
        FindBadVersion demo = new FindBadVersion();

        System.out.println( demo.firstBadVersion(5));
    }
}
