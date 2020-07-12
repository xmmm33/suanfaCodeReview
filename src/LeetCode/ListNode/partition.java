package LeetCode.ListNode;

/**
 * @author humingjiang 2020-07-12 14:32
 **/
public class partition {

    /**
     *
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return head;
        }
        ListNode low = new ListNode(-1);
        ListNode lowhead = low;
        ListNode high = new ListNode(-1);
        ListNode highhead = high;
        while (head != null) {
            if (head.val >= x) {
                high.next = new ListNode(head.val);
                high = high.next;
            }else {
                low.next = new ListNode(head.val);
                low = low.next;
            }
            head = head.next;
        }
        low.next = highhead.next;
        return lowhead.next;
    }
}