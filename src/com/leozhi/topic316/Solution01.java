package com.leozhi.topic316;

import java.util.*;

/**
 * @author leozhi
 * 贪心算法 + 栈
 * 通过
 * 5ms
 */
public class Solution01 {
    public String removeDuplicateLetters(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Integer> position = new HashMap<>();
        Set<Character> element = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            position.put(ch, i);
        }
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (!element.contains(ch)) {
                while (!stack.isEmpty() && ch < stack.peek() && position.get(stack.peek()) > i) {
                    element.remove(stack.pop());
                }
                element.add(ch);
                stack.push(ch);
            }
        }
        char[] chars = new char[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
}
