package LeetCode.ListNode;

/**
 * @author humingjiang 2020-07-12 21:01
 **/
public class insertionSortList {

    /**
     * 链表的插入排序
     * @param head
     * @return
     */
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode shaobin = new ListNode(-1);
        shaobin.next = head;
        ListNode pre = null;
        while (head != null && head.next != null) {
            if (head.val <= head.next.val) {
                head = head.next;
                continue;
            }else {
                pre = shaobin;
                while (pre.next.val < head.next.val) {
                    pre = pre.next;
                }
                ListNode cur = head.next;
                head.next = cur.next;
                cur.next = pre.next;
                pre.next = cur;
            }
        }
        return shaobin.next;
    }
}