package LeetCode.ListNode;

/**
 * @author humingjiang 2020-07-15 15:12
 **/
public class deleteNode {

    /**
     * 删除链表节点,只知道被删除的节点
     * @param node
     */
    public static void deleteNode(ListNode node) {
        // 把node的val设置为next的val值
        node.val = node.next.val;
        // 然后把node的next执行next的next
        node.next = node.next.next;
    }
}