package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 16:34
 **/
public class getKthFromEnd {

    /**
     * 获取链表中的倒数第k个节点
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode a = head;
        ListNode b = head;
        while (k > 0 && a != null) {
            a = a.next;
        }
        while (a != null ) {
            a = a.next;
            b = b.next;
        }
        return b;
    }
}