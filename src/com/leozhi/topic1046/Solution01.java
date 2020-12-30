package com.leozhi.topic1046;

import java.util.Arrays;

/**
 * @author leozhi
 * 排序
 * 通过
 * 1ms
 */
public class Solution01 {
    public int lastStoneWeight(int[] stones) {
        int len = stones.length;
        if (len == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        while (stones[len - 1] != 0) {
            if (stones[len - 2] == 0) {
                return stones[len - 1];
            }
            if (stones[len - 2] == stones[len - 1]) {

                stones[len - 1] = 0;
            } else {
                stones[len - 1] -= stones[len - 2];
            }
            stones[len - 2] = 0;
            Arrays.sort(stones);
        }
        return 0;
    }
}
