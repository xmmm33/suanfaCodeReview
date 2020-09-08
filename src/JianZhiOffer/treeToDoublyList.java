package JianZhiOffer;

/**
 * @author humingjiang 2020-07-25 11:02
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
    }

    Node pre = null;
    Node head = null;
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return root;
        }
        zhongxu(root);
        // 把头结点的前指针指向最后一个节点
        head.left = pre;
        // 把最后一个节点的后指针指向头指针
        pre.right = head;
        return head;
    }

    private void zhongxu(Node root) {
        if (root == null) {
            return;
        }
        zhongxu(root.left);
        if (pre == null) {
            head = root;
        }else {
            // 把前一个节点的后继指针指向当前节点
            pre.right = root;
        }
        // 把当前节点的前驱指针指向pre节点
        root.left = pre;
        // 更新pre节点为当前节点
        pre = root;
        zhongxu(root.right);
    }

    Node pree = null;
    Node headd = null;
    public Node treeToDoublyList2(Node root) {
        if (root == null) {
            return root;
        }
        zhongxubianli(root);
        pree.right = head;
        headd.left = pree;
        return headd;
    }

    private void zhongxubianli(Node root) {
        if (root == null) {
            return;
        }
        zhongxubianli(root.left);
        if (pree == null) {
            head = root;
        }else {
            pree.right = root;
        }
        root.left = pree;
        pree = root;
        zhongxubianli(root.right);
    }
}