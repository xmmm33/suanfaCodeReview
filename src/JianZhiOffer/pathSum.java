package JianZhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author humingjiang 2020-07-25 10:27
 **/
public class pathSum {

    private List<List<Integer>> ret = new ArrayList<>();

    /**
     * 路径和为sum的所有路径
     * @param root
     * @param sum
     * @return
     */
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        qianxu(root, sum, new ArrayList<>());
        return ret;
    }

    private void qianxu(TreeNode root, int sum, ArrayList<Integer> path) {
        if (root.left == null && root.right == null) {
            if (sum == 0) {
                ret.add(new ArrayList<>(path));
            }
            return;
        }
        sum = sum - root.val;
        path.add(root.val);
        qianxu(root.left,sum,path);
        qianxu(root.right, sum, path);
        path.remove(path.size() - 1);
    }
}