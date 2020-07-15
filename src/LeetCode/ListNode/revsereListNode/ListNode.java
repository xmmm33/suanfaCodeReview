package LeetCode.ListNode.revsereListNode;

/**
 * @author humingjiang 2020-07-12 09:08
 **/
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static ListNode buildList(int[] nums) {
        ListNode head = new ListNode(-1);
        ListNode newHead = head;
        for (int i = 0; i < nums.length; i++) {
            head.next = new ListNode(nums[i]);
            head = head.next;
        }
        return newHead.next;
    }
}