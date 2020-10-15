package com.leozhi.topic1235;

import java.util.Arrays;

/**
 * @author leozhi
 */
public class Solution02 {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int[] prevIndex = getPrevIndex(startTime, endTime);
        return getReward(profit, prevIndex, startTime.length - 1);
    }

    public int getReward(int[] profit, int[] prev, int n) {
        if (prev[n] == -1) {
            return 0;
        }
        return Math.max(getReward(profit, prev, n-1), profit[n] + getReward(profit, prev, prev[n]));
    }
    
    public int[] getPrevIndex(int[] startTime, int[] endTime) {
        int[] result = new int[startTime.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < startTime.length; i++) {
            int distance = Integer.MAX_VALUE;
            for (int j = 0; j < endTime.length; j++) {
                if (startTime[i] < endTime[j]) {
                    continue;
                }
                if (distance > startTime[i] - endTime[j]) {
                    distance = startTime[i] - endTime[j];
                    result[i] = j;
                }
            }
        }
        return result;
    }
}
