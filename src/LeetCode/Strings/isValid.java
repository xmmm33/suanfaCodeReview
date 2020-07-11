package LeetCode.Strings;

import java.util.Stack;

/**
 * @author humingjiang 2020-07-11 14:17
 **/
public class isValid {

    /**
     * 是否是有效的括号
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if (s == null || s.length() < 1) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        char[] characters = s.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '{' || characters[i] == '[' || characters[i] == '(') {
                stack.push(characters[i]);
            }
            if (stack.isEmpty()) {
                return false;
            }else {
                if (characters[i] == '}') {
                    char top = stack.peek();
                    if (top == '{') {
                        stack.pop();
                    }else {
                        return false;
                    }
                }
                if (characters[i] == ']') {
                    char top = stack.peek();
                    if (top == '[') {
                        stack.pop();
                    }else {
                        return false;
                    }
                }
                if (characters[i] == ')') {
                    char top = stack.peek();
                    if (top == '(') {
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}