package LeetCode.ListNode;

/**
 * @author humingjiang 2020-07-12 09:53
 **/
public class swapPairs {

    /**
     * 两两交换链表中的节点
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode tmp = pre;
        while (tmp.next != null && tmp.next.next != null) {
            ListNode start = tmp.next;
            ListNode end = tmp.next.next;
            tmp.next = end;
            start.next = end.next;
            end.next = start;
            tmp = start;
        }
        return pre.next;
    }

    /**
     * 反转链表
     * @param head
     * @return
     */
    public ListNode swapPairs2(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}