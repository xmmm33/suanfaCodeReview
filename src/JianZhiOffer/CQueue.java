package JianZhiOffer;

import java.util.Stack;

/**
 * @author humingjiang 2020-07-19 11:05
 **/
public class CQueue {

    private Stack<Integer> in;

    private Stack<Integer> out;
    /**
     * 用两个栈实现队列
     */
    public CQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void appendTail(int value) {
        in.push(value);
    }

    public int deleteHead() {
        if (!out.isEmpty()) {
            return out.pop();
        }else {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
            if (out.isEmpty()) {
                return -1;
            }else {
                return out.pop();
            }
        }
    }
}