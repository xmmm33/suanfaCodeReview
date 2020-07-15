package LeetCode.ListNode;

import java.util.List;

/**
 * @author humingjiang 2020-07-15 14:36
 **/
public class removeElements {

    public static void main(String[] args) {
        ListNode head = ListNode.buildList(new int[]{1});
        removeElements(head, 1);
    }
    /**
     * 删除单链表中的等于val的节点
     * @param head
     * @param val
     * @return
     */
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode shaobin = new ListNode(-1);
        shaobin.next = head;
        ListNode pre = shaobin;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            }else {
                // 注意前节点的更新
                pre = cur;
            }
            cur = cur.next;
        }
        return shaobin.next;
    }
}