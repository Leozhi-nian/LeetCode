package com.leozhi.topic1482;

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 23ms
 */
public class Solution02 {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }
        int left = getMin(bloomDay);
        int right = getMax(bloomDay);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canFinish(bloomDay, mid, m, k)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return canFinish(bloomDay, left, m, k) ? left : -1;
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
