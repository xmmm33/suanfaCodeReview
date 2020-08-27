package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 16:44
 **/
public class isSubStructure {

    /**
     * 判定B是不是A的子树
     * @param A
     * @param B
     * @return
     */
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return dfs(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean dfs(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        }
        if (a == null) {
            return false;
        }
        return a.val == b.val && dfs(a.left, b.left) && dfs(a.right, b.right);
    }

    public boolean isSubStructure2(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return isSame(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean isSame(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        }
        if (a == null) {
            return false;
        }
        return a.val == b.val && isSame(a.left, b.left) && isSame(a.right, b.right);
    }
}