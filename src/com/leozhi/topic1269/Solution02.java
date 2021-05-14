package com.leozhi.topic1269;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 28ms
 */
public class Solution02 {
    public int numWays(int steps, int arrLen) {
        if (arrLen == 1) {
            return 1;
        }
        long[] dp = new long[steps + 1];
        dp[0] = 1;
        Queue<Long> queue = new ArrayDeque<>();
        queue.add(1L);
        for (int j = 1; j <= steps; ++j) {
            long pre = 0;
            if (j < arrLen) {
                queue.add(1L);
            } else {
                pre = queue.poll();
                queue.add((pre + queue.peek()) % 1000000007);
            }
            for (int i = Math.min(j - 1, arrLen - 2); i >= 0; --i) {
                if (i == 0) {
                    dp[j] = (pre + queue.poll()) % 1000000007;
                    queue.add(dp[j]);
                } else {
                    long temp = pre;
                    pre = queue.poll();
                    queue.add((temp + pre + queue.peek()) % 1000000007);
                }
            }
        }
        return (int) dp[steps];
    }
}
