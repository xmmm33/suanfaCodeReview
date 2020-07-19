package JianZhiOffer;

import java.util.Stack;

/**
 * @author humingjiang 2020-07-19 17:29
 **/
public class MinStack {

    private Stack<Integer> stack;

    private Stack<Integer> min;
    /**
     * 最小栈
     */
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.isEmpty()) {
            min.push(x);
        }else {
            if (min.peek() >= x) {
                min.push(x);
            }
        }
    }

    public void pop() {
        int val = stack.pop();
        if (val == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        if (!min.isEmpty()) {
            return min.peek();
        }else {
            return new Integer(null);
        }
    }
}