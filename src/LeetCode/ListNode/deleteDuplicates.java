package LeetCode.ListNode;

import java.util.List;

/**
 * @author humingjiang 2020-07-12 11:40
 **/
public class deleteDuplicates {

    public static void main(String[] args) {
        ListNode head = ListNode.buildList(new int[]{1, 2, 3, 3, 4, 4, 5});
        deleteDuplicates(head);
    }

    /**
     * 删除链表中的重复元素
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        // temp为哨兵节点
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode h = temp;
        ListNode L = temp;
        ListNode R = temp;
        while (temp.next != null) {
            L = temp.next;
            R = temp.next;
            while (R.next != null && R.next.val == L.val) {
                R = R.next;
            }
            // 说明节点值不重复
            if (L == R) {
                temp = temp.next;
            }else {
                temp.next = R.next;
            }
        }
        return h.next;
    }
}