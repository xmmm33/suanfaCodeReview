package JianZhiOffer;

/**
 * @author humingjiang 2020-07-25 16:43
 **/
public class kthLargest {

    private Integer ret = 0;

    private Integer cnt = 0;
    /**
     * 二叉搜索树第k大的数字
     * 注意是第k大；要使用遍历的顺序为  右根左
     * @param root
     * @param k
     * @return
     */
    public int kthLargest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        cnt = k;
        zhongxu(root);
        return ret;
    }

    private void zhongxu(TreeNode root) {
        if (root == null) {
            return;
        }
        zhongxu(root.right);
        cnt--;
        if (cnt == 0) {
            ret = root.val;
            return;
        }
        zhongxu(root.left);
    }
}