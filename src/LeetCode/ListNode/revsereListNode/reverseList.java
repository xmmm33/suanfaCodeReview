package LeetCode.ListNode.revsereListNode;

/**
 * @author humingjiang 2020-07-15 14:55
 **/
public class reverseList {

    /**
     * 反转链表
     * 思路：首先保存head节点的next，然后把节点的next指向pre，然后更新pre指向head节点，然后遍历head节点，
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}