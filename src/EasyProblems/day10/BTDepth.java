package EasyProblems.day10;

public class BTDepth {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }


        /**
         *  PROBLEM LINK:https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/555/
         *  STATUS: ACCEPTED
         *  HELP ? YES
         *  NUM OF SUBMISSIONS ? 1
         *  TRICK LEARNED FROM IT? How to think when you try to solve a problem in a recursive manner
         */


        public int maxDepth(TreeNode root) {
            if (root == null) return 0;

            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
        }
    }
}