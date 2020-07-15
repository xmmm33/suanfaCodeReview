package LeetCode.ListNode;

/**
 * @author humingjiang 2020-07-15 14:22
 **/
public class getIntersectionNode {

    /**
     * 判断两个链表是否相交
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode tempa = headA;
        ListNode tempb = headB;
        while (tempa != tempb) {
            tempa = tempa == null ? headB : tempa.next;
            tempb = tempb == null ? headA : tempb.next;
        }
        return tempa;
    }
}