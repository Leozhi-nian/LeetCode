package com.leozhi.topic875;

/**
 * @author leozhi
 * 暴力枚举
 * 失败
 * 超出时间限制
 */
public class Solution01 {
    public int minEatingSpeed(int[] piles, int H) {
        int max = getMax(piles);
        for (int speed = 1; speed < max; speed++) {
            // 以 speed 的速度能否在 H 小时内吃完香蕉
            if (canFinish(piles, speed, H)) {
                return speed;
            }
        }
        return max;
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
