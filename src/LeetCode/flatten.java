package LeetCode;


import LeetCode.ListNode.TreeNode;

/**
 * @author humingjiang 2020-08-02 11:44
 **/
public class flatten {

    public class TreeNode {
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

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        // 把右子树替换为左子树，然后左子树为null，然后遍历右子树，找到最右子节点，挂入原来的右子树
        root.right = root.left;
        root.left = null;
        while (root.right != null) {
            root = root.right;
        }
        root.right = temp;
    }
}