package com.leozhi.topic714;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 4ms
 */
public class Solution01 {
    public int maxProfit(int[] prices, int fee) {
        int res = 0, len = prices.length, min = prices[0];
        if (len < 2) {
            return 0;
        }
        for (int price : prices) {
            if (price < min) {
                // 未发生买卖时找到第一个最小数，如果发生过买卖则比较当前价格和上次卖出时的价格减去手续费
                min = price;
            } else {
                if (price - fee > min) {
                    res += price - min - fee;
                    // 当前的价格已经减过手续费，所以min的值应为当前价格减去手续费。
                    min = price - fee;
                }
            }
        }
        return res;
    }
}
