package LeetCode.ListNode;

/**
 * @author humingjiang 2020-07-15 14:13
 **/
public class ListNodeGuiBingSort {

    /**
     * 使用归并排序单链表
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode high = slow.next;
        // 把后半链表断掉
        slow.next = null;
        // 开始划分
        ListNode left = sortList(head);
        ListNode right = sortList(high);
        ListNode temp = new ListNode(-1);
        ListNode newhead = temp;
        while (left != null && right != null) {
            if (left.val < right.val) {
                temp.next = new ListNode(left.val);
                left = left.next;
            }else {
                temp.next = new ListNode(right.val);
                right = right.next;
            }
            temp = temp.next;
        }
        temp.next = left == null ? right : left;
        return newhead.next;
    }
}