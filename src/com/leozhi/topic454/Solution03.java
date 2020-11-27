package com.leozhi.topic454;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leozhi
 * 分组 + 哈希表
 * 官方题解
 * 通过
 * 86ms
 */
public class Solution03 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> countAB = new HashMap<>();
        for (int u : A) {
            for (int v : B) {
                countAB.put(u + v, countAB.getOrDefault(u + v, 0) + 1);
            }
        }
        int res = 0;
        for (int u : C) {
            for (int v : D) {
                if (countAB.containsKey(-u - v)) {
                    res += countAB.get(-u - v);
                }
            }
        }
        return res;
    }
}
