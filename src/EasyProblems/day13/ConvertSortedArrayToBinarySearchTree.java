package EasyProblems.day13;

public class ConvertSortedArrayToBinarySearchTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
     }
    }

    /**
 *  PROBLEM LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/631/
 *  STATUS: ACC
 *  HELP ? YES
 *  NUM OF SUBMISSIONS ? 4
 *  TRICK LEARNED FROM IT? NON
 */


     public TreeNode sortedArrayToBST(int[] arr) {
       if(arr.length == 0) 
           return null;
        
       return constructBST(arr, 0, arr.length - 1);
    }
    
    
    private TreeNode constructBST(int[] arr, int left, int right){
        
        if(left > right)
            return null;
        
        int mid = left + (right - left) / 2;
        
        TreeNode current = new TreeNode(arr[mid]);
        
        current.left = constructBST(arr, left, mid - 1);
        current.right = constructBST(arr, mid + 1, right);
        
        return current;
    }

}