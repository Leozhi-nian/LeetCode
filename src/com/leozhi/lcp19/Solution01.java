package com.leozhi.lcp19;

/**
 * @author leozhi
 * 动态规划
 * 官方题解
 * 通过
 * 77ms
 */
public class Solution01 {
    public int minimumOperations(String leaves) {
        int n = leaves.length();
        int[][] dp = new int[n][3];
        // 将第一个字符设置为红色（状态0）需要调整的次数
        dp[0][0] = leaves.charAt(0) == 'y' ? 1 : 0;
        // 第一片叶子不能为黄色（状态1）和红色（状态2），第二片叶子不能为红色（状态2）
        dp[0][1] = dp[0][2] = dp[1][2] = n + 1;
        for (int i = 1; i < n; ++i) {
            int isRed = leaves.charAt(i) == 'r' ? 1 : 0;
            int isYellow = leaves.charAt(i) == 'y' ? 1 : 0;
            dp[i][0] = dp[i - 1][0] + isYellow;
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + isRed;
            if (i >= 2) {
                dp[i][2] = Math.min(dp[i - 1][1], dp[i - 1][2]) + isYellow;
            }
        }
        return dp[n - 1][2];
    }
}
