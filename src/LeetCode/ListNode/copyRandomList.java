package LeetCode.ListNode;

/**
 * @author humingjiang 2020-07-12 17:07
 **/
public class copyRandomList {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp != null) {
            Node clone = new Node(temp.val);
            clone.next = temp.next;
            temp.next = clone;
            temp = clone.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        // 将两个链表分离
        Node h = head.next;
        Node newHead = h;
        temp = head;
        while (temp != null) {
            // 这里主要是为了分离老链表
            temp.next = temp.next.next;
            temp = temp.next;
            // 这里是为了分离复制链表
            if (h.next != null) {
                h.next = h.next.next;
                h = h.next;
            }
        }
        return newHead;
    }
}