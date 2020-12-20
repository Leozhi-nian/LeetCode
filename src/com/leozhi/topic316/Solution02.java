package com.leozhi.topic316;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author leozhi
 * 贪心算法 + 栈
 * 通过
 * 5ms
 */
public class Solution02 {
    public String removeDuplicateLetters(String s) {
        Deque<Character> stack = new LinkedList<>();
        int[] count = new int[26];
        boolean[] isExist = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            ++count[s.charAt(i) - 'a'];
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!isExist[ch - 'a']) {
                while (!stack.isEmpty() && ch < stack.peek() && count[stack.peek() - 'a'] > 0) {
                    isExist[stack.peek() - 'a'] = false;
                    stack.pop();
                }
                stack.push(ch);
                isExist[ch - 'a'] = true;
            }
            --count[ch - 'a'];
        }
        char[] res = new char[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return new String(res);
    }
}
