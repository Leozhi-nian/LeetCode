package com.leozhi.topic3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leozhi
 * 滑动窗口
 * 通过
 */
public class Solution02 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> window = new HashMap<>();

        int left = 0, right = 0;
        int ans = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            window.put(c, window.getOrDefault(c, 0) + 1);
            while (window.get(c) > 1) {
                char d = s.charAt(left);
                left++;
                window.put(d, window.getOrDefault(d, 0) - 1);
            }
            ans = Math.max(ans, right - left);
        }
        return ans;
    }
}
