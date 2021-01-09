package com.leozhi.topic123;

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 105ms
 */
public class Solution01 {
    public int maxProfit(int[] prices) {
        int days = prices.length;
        int[][][] dp = new int[days][3][2];
        for (int i = 0; i < days; i++) {
            for (int k = 2; k >= 1; k--) {
                if (i - 1 == -1) {
                   dp[i][k][0] = 0;
                   dp[i][k][1] = -prices[i];
                   continue;
                }
                dp[i][k][0] = Math.max(dp[i - 1][k][0], dp[i - 1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i - 1][k][1], dp[i - 1][k - 1][0] - prices[i]);
            }
        }
        return dp[days - 1][2][0];
    }
}
