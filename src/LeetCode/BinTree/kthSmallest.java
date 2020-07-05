package LeetCode.BinTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author humingjiang 2020-07-05 16:41
 **/
public class kthSmallest {

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

    private List<Integer> zhongxulist = new ArrayList<>();

    private int ret = 0;

    private int cur = 0;
    /**
     * 在二叉搜索树中查找第k小的
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        zhongxu(root, k);
        return ret;
    }

    private void zhongxu(TreeNode root, int k) {
        if (root == null || k < 0) {
            return;
        }
        zhongxu(root.left, k);
        cur++;
        if (cur == k) {
            ret = root.val;
        }
        zhongxu(root.right,k);
    }
}