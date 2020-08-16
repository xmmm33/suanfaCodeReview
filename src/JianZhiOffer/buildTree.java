package JianZhiOffer;

import java.util.Arrays;

/**
 * @author humingjiang 2020-07-19 10:59
 **/
public class buildTree {

    /**
     * 根据前序和中序重建二叉树
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length < 1 || inorder.length < 1) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < inorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                root.left = buildTree(Arrays.copyOfRange(preorder, 1, i + 1), Arrays.copyOfRange(inorder, 0, i));
                root.right = buildTree(Arrays.copyOfRange(preorder, i + 1, preorder.length), Arrays.copyOfRange(inorder, i + 1, inorder.length));
                break;
            }
        }
        return root;
    }

    public TreeNode build(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length < 1 || inorder.length < 1) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                root.left = build(Arrays.copyOfRange(preorder, 1, i + 1), Arrays.copyOfRange(inorder, 0, i));
                root.right = build(Arrays.copyOfRange(preorder, i + 1, preorder.length), Arrays.copyOfRange(inorder, i + 1, inorder.length));
                break;
            }
        }
        return root;
    }
}