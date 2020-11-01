package com.leozhi.topic392;

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 1ms
 */
public class Solution01 {
    public boolean isSubsequence(String s, String t) {
        return dp(s, 0, t, 0);
    }

    /**
     * 判断 s[i...] 是否是 s[j...]的子序列
     */
    private boolean dp(String s, int i, String t, int j) {
        if (i >= s.length() || j >= t.length()) {
            return i == s.length();
        }
        if (s.charAt(i) == t.charAt(j)) {
            return dp(s, i + 1, t, j + 1);
        } else {
            return dp(s, i, t, j + 1);
        }
    }
}
