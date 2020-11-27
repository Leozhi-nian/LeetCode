package com.leozhi.topic454;

/**
 * @author leozhi
 * 暴力枚举
 * 超出时间限制
 */
public class Solution01 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int len = A.length, res = 0;
        int[] AB = new int[len * len];
        int[] CD = new int[len * len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                AB[i * len + j] = A[i] + B[j];
                CD[i * len + j] = C[i] + D[j];
            }
        }
        for (int i = 0; i < len * len; i++) {
            for (int j = 0; j < len * len; j++) {
                if (AB[i] + CD[j] == 0) {
                    res++;
                }
            }
        }
        return res;
    }
}
