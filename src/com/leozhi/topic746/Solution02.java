package com.leozhi.topic746;

/**
 * @author leozhi
 * 动态规划
 * 官方题解
 * 通过
 * 1ms
 */
public class Solution02 {
    public int minCostClimbingStairs(int[] cost) {
        int f1 = 0, f2 = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            int f0 = cost[i] + Math.min(f1, f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1, f2);
    }
}
