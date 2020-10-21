package com.leozhi.topic875;

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 25ms
 */
public class Solution02 {
    public int minEatingSpeed(int[] piles, int H) {
        int left = 1, right = getMax(piles) + 1;
        while (left < right) {
            // 防止溢出
            int mid = left + (right - left) / 2;
            if (canFinish(piles, mid, H)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canFinish(int[] piles, int speed, int H) {
        int time = 0;
        for (int pile : piles) {
            time += timeOf(pile, speed);
            if (time > H) {
                return false;
            }
        }
        return time <= H;
    }

    private int timeOf(int n, int speed) {
        return (n / speed) + ((n % speed > 0) ? 1 : 0);
    }

    private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(pile, max);
        }
        return max;
    }
}
