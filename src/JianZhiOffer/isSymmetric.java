package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 16:54
 **/
public class isSymmetric {

    /**
     * 是不是对称二叉树
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return dfs(root, root);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left != null && right != null) {
            if (left.val != right.val) {
                return false;
            }else {
                return dfs(left.left, right.right) && dfs(left.right, right.left);
            }
        }
        return false;
    }
}