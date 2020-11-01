package com.leozhi.topic392;

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 13ms
 */
public class Solution02 {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        } else if(t.length() == 0) {
            return false;
        }
        int m = s.length(), n = t.length();
        boolean[][] dp = new boolean[m][n];
        dp[0][0] = s.charAt(0) == t.charAt(0);
        for (int i = 1; i < m; i++) {
            dp[i][0] = s.charAt(i) == t.charAt(0);
            for (int j = 1; j < n; j++) {
                if (s.charAt(0) == t.charAt(j)) {
                    dp[0][j] = true;
                } else {
                    dp[0][j] = dp[0][j - 1];
                }
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        print(dp);
        return dp[m - 1][n - 1];
    }

    private void print(boolean[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            System.out.print("i" + i + " ");
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
