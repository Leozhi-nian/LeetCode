package com.leozhi.topic712;

/**
 * @author leozhi
 */
public class Solution02 {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length(), n = s2.length(), res = 0;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == s1.length()) {
                    for (; j < s2.length(); j++) {
                        res += s2.charAt(j);
                    }
                }
                if (j == s2.length()) {
                    for (; i < s1.length(); i++) {
                        res += s1.charAt(i);
                    }
                }
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(s1.charAt(i - 1) + dp[i][j - 1], s2.charAt(j - 1) + dp[i - 1][j]);
                }
            }
        }
        return dp[m][n] + res;
    }
}
