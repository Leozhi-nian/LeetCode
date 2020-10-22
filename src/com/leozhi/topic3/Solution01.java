package com.leozhi.topic3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leozhi
 * 滑动窗口
 * 官方题解
 * 通过
 * 7ms
 */
public class Solution01 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int index = -1, n = s.length(), ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                window.remove(s.charAt(i - 1));
            }
            while (index + 1 < n && !window.contains(s.charAt(index + 1))) {
                window.add(s.charAt(index + 1));
                index++;
            }
            ans = Math.max(ans, index - i + 1);
        }
        return ans;
    }
}
