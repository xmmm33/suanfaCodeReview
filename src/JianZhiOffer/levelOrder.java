package JianZhiOffer;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author humingjiang 2020-07-25 09:52
 **/
public class levelOrder {

    /**
     * 二叉树的层次遍历
     * @param root
     * @return
     */
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ret = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                ret.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        int[] r = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            r[i] = ret.get(i);
        }
        return r;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer> > result = new ArrayList<> ();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> r = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                r.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(r);
        }
        return result;
    }

}