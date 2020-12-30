package com.leozhi.topic1046;

import java.util.PriorityQueue;

/**
 * @author leozhi
 * 最大堆
 * 官方题解
 * 通过
 * 2ms
 */
public class Solution02 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            priorityQueue.offer(stone);
        }
        while (priorityQueue.size() > 1) {
            int a = priorityQueue.poll();
            int b = priorityQueue.poll();
            if (a > b) {
                priorityQueue.offer(a - b);
            }
        }
        return priorityQueue.isEmpty() ? 0 : priorityQueue.poll();
    }
}
