package com.leozhi.topic322;

import java.util.Arrays;

/**
 * @author leozhi
 */
public class Solution01 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);

        dp[0] = 0;
        for (int i=0; i<dp.length; i++) {
            for (int coin : coins) {
                if (i-coin < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i-coin]);
            }
        }
        return (dp[amount] == amount + 1) ? -1 : dp[amount];
    }
}
