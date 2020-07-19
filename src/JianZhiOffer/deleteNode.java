package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 15:43
 **/
public class deleteNode {

    /**
     * 删除链表中的节点
     * @param head
     * @param val
     * @return
     */
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode shaobing = new ListNode(-1);
        shaobing.next = head;
        ListNode pre = shaobing;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val == val) {
                pre.next = temp.next;
            }
            pre = temp;
            temp = temp.next;
        }
        return shaobing.next;
    }
}