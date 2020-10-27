package com.leozhi.topic122;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 1ms
 */
public class Solution01 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
