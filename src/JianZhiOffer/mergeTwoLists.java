package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 16:39
 **/
public class mergeTwoLists {

    /**
     * 合并两个有序的链表
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode shaobin = new ListNode(-1);
        ListNode head = shaobin;
        ListNode a = l1;
        ListNode b = l2;
        while (a != null && b != null) {
            if (a.val > b.val) {
                shaobin.next = new ListNode(b.val);
                b = b.next;
            } else {
                shaobin.next = new ListNode(a.val);
                a = a.next;
            }
            shaobin = shaobin.next;
        }
        if (a != null) {
            shaobin.next = a;
        }
        if (b != null) {
            shaobin.next = b;
        }
        return head.next;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode shaobin = new ListNode(-1);
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                shaobin.next = l1;
                l1 = l1.next;
            }else {
                shaobin.next = l2;
                l2 = l2.next;
            }
            shaobin = shaobin.next;
        }
        if (l1 != null) {
            shaobin.next = l1;
        }
        if (l2 != null) {
            shaobin.next = l2;
        }
        return shaobin.next;
    }
}