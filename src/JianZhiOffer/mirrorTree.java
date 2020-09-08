package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 16:52
 **/
public class mirrorTree {

    /**
     * 二叉树的镜像
     *
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

    public TreeNode mirrorTree2(TreeNode root) {
        if (root == null) {
            return root;
        }
        // 交换左右子树
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTree2(root.left);
        mirrorTree2(root.right);
        return root;
    }
}