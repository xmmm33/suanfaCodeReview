package JianZhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author humingjiang 2020-07-19 10:52
 **/
public class reversePrint {

    /**
     * 从尾到头打印链表
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        List<Integer> temp = new ArrayList<>();
        while (head != null) {
            temp.add(0,head.val);
            head = head.next;
        }
        int[] ret = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            ret[i] = temp.get(i);
        }
        return ret;
    }
}