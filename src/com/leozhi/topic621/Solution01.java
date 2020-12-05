package com.leozhi.topic621;

import java.util.*;

/**
 * @author leozhi
 * 构造
 * 官方题解
 * 通过
 * 18ms
 */
public class Solution01 {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> freq = new HashMap<>();
        // 最多的执行次数
        int maxExec = 0;
        for (char task : tasks) {
            int exec = freq.getOrDefault(task, 0) + 1;
            freq.put(task, exec);
            maxExec = Math.max(maxExec, exec);
        }

        // 具有最多执行次数的任务数量
        int maxCount = 0;
        Set<Map.Entry<Character, Integer>> entries = freq.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            int value = entry.getValue();
            if (value == maxExec) {
                ++maxCount;
            }
        }
        return Math.max((maxExec - 1) * (n + 1) + maxCount, tasks.length);
    }
}
