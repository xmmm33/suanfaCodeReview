package LeetCode.ListNode;

/**
 * @author humingjiang 2020-07-12 13:03
 **/
public class deleteDuplicatesI {

    /**
     * 删除链表重复元素 I
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode shaobin = new ListNode(-1);
        shaobin.next = head;
        ListNode ret = shaobin;
        ListNode L = shaobin;
        ListNode R = shaobin;
        while (shaobin.next != null) {
            L = shaobin.next;
            R = shaobin.next;
            while (R.next != null && R.next.val == L.val) {
                R = R.next;
            }
            if (L == R) {
                shaobin = shaobin.next;
            }else {
                shaobin.next = R;
            }
        }
        return ret.next;
    }
}