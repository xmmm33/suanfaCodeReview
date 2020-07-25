package JianZhiOffer;

/**
 * @author humingjiang 2020-07-25 16:51
 **/
public class maxDepth {

    /**
     * 二叉树的深度
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(dfs(root.left), dfs(root.right));
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(dfs(root.left) + 1, dfs(root.right) + 1);
    }
}