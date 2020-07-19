package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 16:52
 **/
public class mirrorTree {

    /**
     * 二叉树的镜像
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}