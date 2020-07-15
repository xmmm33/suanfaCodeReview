package LeetCode.ListNode.revsereListNode;


/**
 * @author humingjiang 2020-07-12 10:31
 **/
public class reverseKGroup {

    /**
     * K组反转链表
     * 思路：就是以K个节点为一组，做反转链表操作
     * 参考：https://leetcode-cn.com/problems/reverse-nodes-in-k-group/solution/di-gui-java-by-reedfan-2/
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }
        // 反转k个元素
        ListNode newHead = reverseList(head, tail);
        // 下一次元素开始的地方就是tail;head.next的意思就是这一次反转完成的链表头的下一个位置是 下一次k个元素反转完成的链表头
        head.next = reverseKGroup(tail, k);
        return newHead;
    }

    /**
     * 反转链表
     * @param head
     * @param tail
     * @return
     */
    private ListNode reverseList(ListNode head, ListNode tail) {
        ListNode pre = null;
        ListNode next = null;
        while (head != tail) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}