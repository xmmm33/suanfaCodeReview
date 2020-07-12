package LeetCode.ListNode;

/**
 * @author humingjiang 2020-07-12 10:41
 **/
public class rotateRight {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = null;
        rotateRight2(head, 2);
    }
    /**
     * 旋转链表
     * 思路：跟旋转数组的思路一致，首先保存链表的最后一个元素的值，然后链表依次后移一位，然后把头结点的元素替换为原最后一个元素的值
     * 输入: 1->2->3->4->5->NULL, k = 2
     * 输出: 4->5->1->2->3->NULL
     * 解释:
     * 向右旋转 1 步: 5->1->2->3->4->NULL
     * 向右旋转 2 步: 4->5->1->2->3->NULL
     * @param head
     * @param k
     * @return
     */
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        ListNode fast = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        temp = head;
        k = k % len;
        for (int i = 0; i < k; i++) {
            ListNode tail = null;
            ListNode pre = null;
            while (fast.next != null) {
                pre = fast;
                fast = fast.next;
            }
            tail = fast;
            tail.next = temp;
            temp = tail;
            pre.next = null;
        }
        return fast;
    }

    /**
     * 思路2 ：
     *         把链表尾部数据直接链接到头部，时间复杂度底，但是空间复杂度搞
     * @param head
     * @param k
     * @return
     */
    public static ListNode rotateRight2(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        k = k % len;
        int moves = len - k;
        ListNode h1 = head;
        ListNode h2 = head;
        ListNode pre = head;
        while (moves > 0) {
            pre = h1;
            h1 = h1.next;
            moves--;
        }
        if (h1 == null) {
            return head;
        }
        pre.next = null;
        ListNode ret = h1;
        while (h1.next != null) {
            h1 = h1.next;
        }
        h1.next = h2;
        return ret;
    }
}