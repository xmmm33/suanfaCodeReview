package JianZhiOffer;

/**
 * @author humingjiang 2020-07-25 16:51
 **/
public class maxDepth {

    /**
     * 二叉树的深度
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth2(root.left), maxDepth2(root.right));
    }
}