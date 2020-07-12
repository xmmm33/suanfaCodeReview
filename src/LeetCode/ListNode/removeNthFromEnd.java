package LeetCode.ListNode;

/**
 * @author humingjiang 2020-07-12 09:18
 **/
public class removeNthFromEnd {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        removeNthFromEnd(head, 1);
    }
    /**
     * 删除链表倒数第k个节点
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode pre = head;
        ListNode slow = head;
        ListNode fast = head;
        while (n > 0 && fast != null) {
            pre = fast;
            fast = fast.next;
            n--;
        }
        if (fast == null) {
            head = slow.next;
            return head;
        }
        while (slow != null && fast != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        pre.next = slow.next;
        return head;
    }
}