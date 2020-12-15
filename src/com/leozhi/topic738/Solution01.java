package com.leozhi.topic738;

import java.util.Arrays;

/**
 * @author leozhi
 * 贪心 + 快慢指针
 * 通过 2ms
 */
public class Solution01 {
    public int monotoneIncreasingDigits(int N) {
        if (N < 10) {
            return N;
        }
        char[] chars = String.valueOf(N).toCharArray();
        int len = chars.length, fast = 1, slow = 0;
        while (fast < len) {
            if (chars[slow] < chars[fast]) {
                slow = fast;
                ++fast;
            } else if (chars[slow] == chars[fast]) {
                ++fast;
            } else if (chars[slow] > chars[fast]) {
                chars[slow] -= 1;
                Arrays.fill(chars, slow + 1, len, '9');
            }
        }
        return Integer.parseInt(String.valueOf(chars));
    }
}
