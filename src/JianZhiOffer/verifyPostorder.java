package JianZhiOffer;

/**
 * @author humingjiang 2020-07-25 10:09
 **/
public class verifyPostorder {

    /**
     * 二叉搜索树的后续遍历序列判断合法性
     * @param postorder
     * @return
     */
    public boolean verifyPostorder(int[] postorder) {
        if (postorder == null || postorder.length < 1) {
            return true;
        }
        return recur(postorder, 0, postorder.length - 1);
    }

    private boolean recur(int[] postorder, int i, int j) {
        if (i > j) {
            return true;
        }
        int p = i;
        while (postorder[p] < postorder[j]) {
            p++;
        }
        int m = p;
        while (postorder[p] > postorder[j]) {
            p++;
        }
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}