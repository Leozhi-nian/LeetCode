package com.leozhi.topic925;

import java.util.Stack;

/**
 * @author leozhi
 * 栈
 * 通过
 * 2ms
 */
public class Solution02 {
    public boolean isLongPressedName(String name, String typed) {
        Stack<Character> stack = new Stack<>();
        for (int i = name.length() - 1; i >= 0; i--) {
            stack.push(name.charAt(i));
        }
        int i = 0;
        while (i < typed.length()) {
            if (!stack.isEmpty() && stack.peek() == typed.charAt(i)) {
                i++;
                stack.pop();
            } else if(i != 0 && typed.charAt(i) == typed.charAt(i - 1)) {
                i++;
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
