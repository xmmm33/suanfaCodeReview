package JianZhiOffer;

/**
 * @author humingjiang 2020-07-25 16:04
 **/
public class getIntersectionNode {

    /**
     * 两个链表的第一个公共节点
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode h1 = headA;
        ListNode h2 = headB;
        while (h1 != h2) {
            h1 = h1 == null ? headB : h1.next;
            h2 = h2 == null ? headA : h2.next;
        }
        return h2;
    }
}