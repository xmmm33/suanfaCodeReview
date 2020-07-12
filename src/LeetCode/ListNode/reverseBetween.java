package LeetCode.ListNode;

/**
 * @author humingjiang 2020-07-12 14:42
 **/
public class reverseBetween {

    public static void main(String[] args) {
        ListNode hh = ListNode.buildList(new int[]{1,2,3,4,5});
        reverseBetween(hh, 1, 2);
    }

    /**
     * 反转区间m，n之间的链表节点
     * 参考：https://leetcode-cn.com/problems/reverse-linked-list-ii/solution/shou-hui-man-hua-tu-jie-leetcodezhi-fan-zhuan-li-2/
     * @param head
     * @param m
     * @param n
     * @return
     */
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || m == n) {
            return head;
        }
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode a = temp;
        ListNode d = temp;
        // 让a指向第m-1个节点
        for (int i = 0; i < m - 1; i++) {
            a = a.next;
        }
        // 让d指向第n个节点
        for (int i = 0; i < n; i++) {
            d = d.next;
        }
        // b指向的时候第一个需要反转的节点
        ListNode start = a.next;
        ListNode p = start;
        ListNode q = start.next;
        // 让c指向n节点的后面一个节点，在最后的时候让m节点的next指针连上这个节点
        ListNode c = d.next;
        while (q != c) {
            ListNode next = q.next;
            q.next = p;
            p = q;
            q = next;
        }
        a.next = d;
        start.next = c;
        return temp.next;
    }
}