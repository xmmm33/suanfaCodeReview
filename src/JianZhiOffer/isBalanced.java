package JianZhiOffer;

/**
 * @author humingjiang 2020-07-25 17:07
 **/
public class isBalanced {

    /**
     * 判断二叉树是否平衡
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 先计算出左右子树的高度
        int left = dfs(root.left);
        int right = dfs(root.right);
        // 然后判断是否平衡
        if (Math.abs(left - right) > 1) {
            return false;
        }else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(dfs(root.left), dfs(root.right));
    }
}