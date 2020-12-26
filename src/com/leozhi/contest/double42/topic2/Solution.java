package com.leozhi.contest.double42.topic2;

/**
 * @author leozhi
 * 模拟
 * 通过
 * 3ms
 */
public class Solution {
    public double averageWaitingTime(int[][] customers) {
        double res = 0;
        int cur = 0;
        for (int[] customer : customers) {
            // 当前订单开始
            cur = Math.max(cur, customer[0]);
            // 当前订单结束
            cur += customer[1];
            // 当前订单花费时间
            res += cur - customer[0];
        }
        return res / (double)customers.length;
    }
}
