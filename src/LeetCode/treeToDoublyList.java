package LeetCode;

/**
 * @author humingjiang 2020-08-02 12:02
 **/
public class treeToDoublyList {

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };

    // 用于暂存前节点
    Node pre = null;
    // head指向的就是最左子树节点，也就是双向链表的头结点
    Node head = null;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return root;
        }
        zhongxu(root);
        pre.right = head;
        head.left = pre;
        return head;
    }

    private void zhongxu(Node root) {
        if (root == null) {
            return;
        }
        zhongxu(root.left);
        if (pre == null) {
            // 找到最左子节点
            head = root;
        }else {
            pre.right = root;
            root.left = pre;
        }
        pre = root;
        zhongxu(root.right);
    }

}