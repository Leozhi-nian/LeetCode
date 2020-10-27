package com.leozhi.topic122;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 1ms
 */
public class Solution02 {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            // 今天相对于前一天变化
            int diff = prices[i] - prices[i - 1];
            // 今天相较于前一天上涨时
            if (diff > 0) {
                res += diff;
            }
        }
        return res;
    }
}
