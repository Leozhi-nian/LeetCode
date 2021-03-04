package com.leozhi.topic354;

import java.util.Arrays;

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 259ms
 */
public class Solution02 {
    public int maxEnvelopes(int[][] envelopes) {
        int size = envelopes.length;
        if (size <= 1) {
            return size;
        }
        Arrays.sort(envelopes, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o2[1] - o1[1];
            } else {
                return o1[0] - o2[0];
            }
        });
        int[] dp = new int[size];
        Arrays.fill(dp, 1);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[i][1] > envelopes[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int res = 0;
        for (int num : dp) {
            res = Math.max(res, num);
        }
        return res;
    }
}
