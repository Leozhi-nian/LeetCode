package com.leozhi.topic454;

import java.util.*;

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 150ms
 */
public class Solution02 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int len = A.length, res = 0;
        Map<Integer, Integer> mapAB = new HashMap<>();
        Map<Integer, Integer> mapCD = new HashMap<>();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                mapAB.put(A[i] + B[j], mapAB.getOrDefault(A[i] + B[j], 0) + 1);
                mapCD.put(C[i] + D[j], mapCD.getOrDefault(C[i] + D[j], 0) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mapAB.entrySet()) {
            if (mapCD.containsKey(-entry.getKey())) {
                res += entry.getValue() * mapCD.get(-entry.getKey());
            }
        }
        return res;
    }
}
