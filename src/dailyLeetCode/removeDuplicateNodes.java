package dailyLeetCode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class removeDuplicateNodes {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 移除单链表中重复的节点
     * @param head
     * @return
     */
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode temp = new ListNode(-1);
        ListNode newHead = temp;
        Set<Integer> fuzhi = new HashSet<>();
        while (head != null) {
            if (fuzhi.add(head.val)) {
                temp.next = new ListNode(head.val);
                temp = temp.next;
            }
            head = head.next;
        }
        return newHead.next;
    }
}
