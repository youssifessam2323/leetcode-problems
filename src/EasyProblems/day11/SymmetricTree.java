package EasyProblems.day11;

public class SymmetricTree {
/**
 *  PROBLEM LINK:https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/627/
 *  STATUS: ACC
 *  HELP ? YES
 *  NUM OF SUBMISSIONS ? 1
 *  TRICK LEARNED FROM IT? How to applying an idea into a recursive solution 
 */


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

  
    public boolean isSymmetric(TreeNode root) {

        if(root == null) return true;

        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        
        else if(left != null && right != null){
            return left.val == right.val 
            && isSymmetric(left.left, right.right)
            && isSymmetric(left.right, right.left);
        }
//Inorder traversal => left, curr, right ==> 
        return false;

    }   


    public static void main(String[] args) {
        SymmetricTree tree = new SymmetricTree();
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(1)),
                new TreeNode(2, new TreeNode(21), new TreeNode(3)));
       System.out.println( tree.isSymmetric(root));
    }
      
}
