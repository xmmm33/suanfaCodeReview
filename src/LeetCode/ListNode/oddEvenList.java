package LeetCode.ListNode;

/**
 * @author humingjiang 2020-07-15 15:35
 **/
public class oddEvenList {

    /**
     * 奇偶链表
     * @param head
     * @return
     */
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode ji = head;
        ListNode ou = head.next;
        ListNode ouhead = ou;
        while (ou != null && ou.next != null) {
            ji.next = ou.next;
            ji = ji.next;
            ou.next = ji.next;
            ou = ou.next;
        }
        ji.next = ouhead;
        return head;
    }
}