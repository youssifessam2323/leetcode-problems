package EasyProblems.day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 *  PROBLEM LINK:https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/628/
 *  STATUS: ACCEPTED
 *  HELP ? YES
 *  NUM OF SUBMISSIONS ? 4
 *  TRICK LEARNED FROM IT? How to implement BFS using both iteration and recursion
 */


public class BinaryTreeLevelOrderTraversal {
 
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


    public List<List<Integer>> levelOrderIterationSolution(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(queue.size() > 0){
            List<Integer> levelValues = new ArrayList<>();
            var len = queue.size();

            for (int i = 0; i < len ; i++) {
                var current = queue.remove();
                
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);

                levelValues.add(current.val);
            }
            result.add(levelValues);
        }

        return result;
    }

    public List<List<Integer>> levelOrderRecursiveSolution(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        traverseHelper(root,0, levels);
        return levels;
    }

    // [lvl1, lvl2, ]
    private void traverseHelper(TreeNode root, int level, List<List<Integer>> levels) {
        
        if (levels.size() == level)
            levels.add(new ArrayList<>());

        levels.get(level).add(root.val);

        if(root.left != null) traverseHelper(root.left, level + 1, levels);
        if(root.right != null) traverseHelper(root.right, level + 1, levels);
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal demo = new BinaryTreeLevelOrderTraversal();

        TreeNode root = new TreeNode(1,
        new TreeNode(2, new TreeNode(3), new TreeNode(1)),
        new TreeNode(2, new TreeNode(21), new TreeNode(3)));

     System.out.println(   demo.levelOrderRecursiveSolution(root));
    }
}
