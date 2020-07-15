package LeetCode.ListNode.revsereListNode;

/**
 * @author humingjiang 2020-07-15 15:04
 **/
public class isPalindrome {

    /**
     * 回文链表的判断
     * 也是利用反转链表和快慢指针来做
     * 首先利用快慢指针找到链表的中点
     * 然后从中点开始反转后半的链表
     * 最后比较两部分链表
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode pre = slow;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }
        while (pre != null && head != null) {
            if (pre.val != head.val) {
                return false;
            }
            pre = pre.next;
            head = head.next;
        }
        return true;
    }
}