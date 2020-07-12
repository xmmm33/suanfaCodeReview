package LeetCode.ListNode;

/**
 * @author humingjiang 2020-07-12 09:40
 **/
public class mergeTwoLists {

    /**
     * 合并两个有序的链表
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode temp = new ListNode(-1);
        ListNode head = temp;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
            }else {
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            temp = temp.next;
        }
        if (l1 != null) {
            temp.next = l1;
        }
        if (l2 != null) {
            temp.next = l2;
        }
        return head.next;
    }
}