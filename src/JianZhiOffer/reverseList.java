package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 16:37
 **/
public class reverseList {

    /**
     * 反转链表
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        ListNode pre = null;
        while (temp != null) {
            ListNode next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        return pre;
    }
}