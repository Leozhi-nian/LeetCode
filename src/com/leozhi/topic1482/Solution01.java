package com.leozhi.topic1482;

/**
 * @author leozhi
 * 暴力枚举
 * 失败
 * 超出时间限制
 */
public class Solution01 {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }
        int max = getMax(bloomDay);
        int min = getMin(bloomDay);
        for (int day = min; day <= max; day++) {
            if (canFinish(bloomDay, day,m, k)) {
                return day;
            }
        }
        return -1;
    }

    private boolean canFinish(int[] days, int day, int m, int k) {
        int count = 0;
        for (int j : days) {
            if (j <= day) {
                count++;
            } else {
                count = 0;
            }
            if (count == k) {
                m--;
                count = 0;
            }
        }
        return m <= 0;
    }

    private int getMax(int[] days) {
        int max = 0;
        for (int day : days) {
            max = Math.max(day, max);
        }
        return max;
    }

    private int getMin(int[] days) {
        int min = days[0];
        for (int day : days) {
            min = Math.min(day, min);
        }
        return min;

    }
}
