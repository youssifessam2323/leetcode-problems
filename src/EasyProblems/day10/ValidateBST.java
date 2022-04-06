package EasyProblems.day10;

public class ValidateBST {


    private static class TreeNode {
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
    }
        public boolean isValidBST(TreeNode root) {

            if (root == null) return true;

            return validate(root, null, null);
        }

        boolean validate(TreeNode root, Integer max, Integer min) {
            if (root == null) return true;

            if (max != null && root.val >= max || min != null && root.val >= min) {
                return false;
            } else {
                return validate(root.left, root.val, min) && validate(root.right, max, root.val);
            }
        }

    public static void main(String[] args) {
        ValidateBST demo = new ValidateBST();

        TreeNode root = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));

        System.out.println(demo.isValidBST(root));
    }
}