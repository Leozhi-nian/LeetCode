package com.leozhi.topic583;

import java.util.Arrays;

/**
 * @author leozhi
 * 动态规划 自顶而下
 * 复用 1143. 最长公共子序列
 * 通过
 * 11ms
 */
public class Solution01 {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int lcs = lcs(word1, word2);
        return m - lcs + n - lcs;
    }

    int[][] memo;
    public int lcs(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        memo = new int[m][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return dp(text1, 0, text2, 0);
    }
    public int dp(String s1, int i, String s2, int j) {
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            memo[i][j] = dp(s1, i + 1, s2, j + 1) + 1;
        } else {
            memo[i][j] = Math.max(dp(s1, i + 1, s2, j), dp(s1, i, s2, j + 1));
        }
        return memo[i][j];
    }
}
