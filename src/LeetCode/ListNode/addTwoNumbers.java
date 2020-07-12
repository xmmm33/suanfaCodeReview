package LeetCode.ListNode;

/**
 * @author humingjiang 2020-07-12 09:07
 **/
public class addTwoNumbers {

    /**
     * 两个链表求和
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode temp = new ListNode(-1);
        ListNode head = temp;
        int jinwei = 0;
        while (l1 != null || l2 != null) {
            int a1 = l1 == null ? 0 : l1.val;
            int a2 = l2 == null ? 0 : l2.val;
            int sum = a1 + a2 + jinwei;
            jinwei = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        while (jinwei > 0) {
            temp.next = new ListNode(jinwei % 10);
            jinwei /= 10;
        }
        return head.next;
    }
}