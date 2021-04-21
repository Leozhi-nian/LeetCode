package com.leozhi.topic91;

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 1ms
 */
public class Solution02 {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int len = s.length();
        int pre = 1;
        int cur = 1;
        for (int i = 1; i < len; i++) {
            int temp = cur;
            if (s.charAt(i) == '0') {
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2') {
                    cur = pre;
                } else {
                    return 0;
                }
            } else if (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) >= '1' && s.charAt(i) <= '6')) {
                cur += pre;
            }
            pre = temp;
        }
        return cur;
    }
}
