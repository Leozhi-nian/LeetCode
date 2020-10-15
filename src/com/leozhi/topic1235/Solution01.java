package com.leozhi.topic1235;

/**
 * @author leozhi
 */
public class Solution01 {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int[] prev = new int[profit.length];
        for (int i = 0; i < prev.length; i++) {
            prev[i] = getPrevIndex(endTime, startTime[i]);
        }
        return getReward(profit, prev, prev.length - 1);
    }

    public int getReward(int[] profit, int[] prev, int n) {
        if (n <= 0) {
            return n == 0 ? profit[0] : 0;
        }
        return Math.max(getReward(profit, prev, n-1), profit[n] + getReward(profit, prev, prev[n]));
    }

    public int getPrevIndex(int[] endTime, int startTime) {
        int result = 0;
        for (int i=0; i<endTime.length; i++) {
            if (endTime[i] > startTime) {
                continue;
            }
            int distance = startTime - endTime[i];
            if (distance <= startTime - endTime[result]) {
                result = i;
            }
            return result;
        }
        return -1;
    }
}
