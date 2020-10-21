package com.leozhi.topic1011;

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 14ms
 */
public class Solution01 {
    /**
     * 寻找左侧边界的二分查找
     */
    public int shipWithinDays(int[] weights, int D) {
        // 载重可能的最小值
        int left = getMax(weights);
        // 载重可能的最大值 + 1
        int right = getSum(weights) + 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canFinish(weights, D, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    /**
     * 如果载重为 cap，是否能在 D 天内运完货物？
     */
    private boolean canFinish(int[] weights, int D, int cap) {
        int i = 0;
        for (int day = 0; day < D; day++) {
            int maxCap = cap;
            while ((maxCap -= weights[i]) >= 0) {
                i++;
                if (i == weights.length) {
                    return true;
                }
            }
        }
        return false;
    }

    private int getMax(int[] weights) {
        int max = 0;
        for (int weight : weights) {
            max = Math.max(weight, max);
        }
        return max;
    }

    private int getSum(int[] weights) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }
        return sum;
    }
}
