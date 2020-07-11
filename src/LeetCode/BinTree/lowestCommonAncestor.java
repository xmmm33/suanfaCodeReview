package LeetCode.BinTree;

/**
 * @author humingjiang 2020-07-05 16:52
 **/
public class lowestCommonAncestor {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 二叉搜索树的最近公共祖先
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (p == root) {
            return p;
        }
        if (q == root) {
            return q;
        }
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor2(root.right, p, q);
        } else if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor2(root.left, p, q);
        }
        return root;
    }

    /**
     * 二叉树的最近公共最先
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor3(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        if (p == root || q == root) {
            return root;
        }
        TreeNode left = lowestCommonAncestor3(root.left, p, q);
        TreeNode right = lowestCommonAncestor3(root.right, p, q);
        if (left != null && right != null) {
            return root;
        } else if (left != null) {
            return left;
        } else if (right != null) {
            return right;
        }
        return null;
    }
}