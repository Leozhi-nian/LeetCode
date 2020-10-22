package com.leozhi.topic1614;

/**
 * @author leozhi
 * 通过
 * 1ms
 */
public class Solution01 {
    public int maxDepth(String s) {
        int d = 0;
        int length = s.length();
        int ans = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '(') {
                ++d;
                if (d > ans) {
                    ans = d;
                }
            } else if (s.charAt(i) == ')'){
                --d;
            }
        }
        return ans;
    }
}
