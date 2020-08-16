package JianZhiOffer;

import org.w3c.dom.Node;

import java.util.List;

/**
 * @author humingjiang 2020-07-25 10:49
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

    public Node copyRandomList2(Node head) {
        if (head == null) {
            return head;
        }
        Node temp = head;
        while (temp != null) {
            Node next = temp.next;
            Node copy = new Node(temp.val);
            temp.next = copy;
            copy.next = next;
            temp = next;
        }
        temp = head;
        while (temp != null && temp.next != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        Node temphead = head.next;
        Node copyhead = temphead;
        temp = head;
        while (temp != null && temp.next != null) {
            temp.next = temp.next.next;
            temp = temp.next;
            if (temphead.next != null) {
                temphead.next = temphead.next.next;
                temphead = temphead.next;
            }
        }
        return copyhead;
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        Node temp = head;
        while (temp != null) {
            Node next = temp.next;
            Node copy = new Node(temp.val);
            temp.next = copy;
            copy.next = next;
            temp = next;
        }
        temp = head;
        while (temp != null && temp.next != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        Node h = head.next;
        Node newhead = h;
        temp = head;
        while (temp != null) {
            temp.next = temp.next.next;
            temp = temp.next;
            if (h.next != null) {
                h.next = h.next.next;
                h = h.next;
            }
        }
        return newhead;
    }
}