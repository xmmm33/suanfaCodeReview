package JianZhiOffer;

import java.util.Stack;

/**
 * @author humingjiang 2020-07-19 17:43
 **/
public class validateStackSequences {

    public static void main(String[] args) {
        validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1});
    }

    private static Stack<Integer> temp = new Stack<>();
    /**
     * 压入压出顺序
     * @param pushed
     * @param popped
     * @return
     */
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        int k = 0;
        for (int i = 0; i < pushed.length; i++) {
            if (pushed[i] != popped[k]) {
                temp.push(pushed[i]);
            }else {
                k++;
                while (!temp.isEmpty() && temp.peek() == popped[k]) {
                    temp.pop();
                    k++;
                }
            }
        }
        while (k < popped.length && temp.peek() == popped[k]) {
            k++;
            temp.pop();
        }
        return temp.isEmpty();
    }
}