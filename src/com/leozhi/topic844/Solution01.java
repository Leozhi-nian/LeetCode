package com.leozhi.topic844;

import java.util.Stack;

/**
 * @author leozhi
 * 栈
 * 通过
 * 1ms
 */
public class Solution01 {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1;
        Stack<Character> stack2;
        stack1 = pushChar(S, S.length());
        stack2 = pushChar(T, T.length());
        if (stack1.size() != stack2.size()) {
            return false;
        }
        int size = stack1.size();
        for (int i = 0; i < size; i++) {
            if (!stack1.pop().equals(stack2.pop())) {
                return false;
            }
        }
        return true;
    }

    private Stack<Character> pushChar(String S, int size) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            if (S.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                continue;
            }
            stack.push(S.charAt(i));
        }
        return stack;
    }
}
