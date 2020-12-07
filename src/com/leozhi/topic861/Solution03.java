package com.leozhi.topic861;

/**
 * @author leozhi
 * 贪心算法
 * 官方题解
 * 通过
 * 0ms
 */
public class Solution03 {
    public int matrixScore(int[][] A) {
        int m = A.length, n = A[0].length;
        // 最高位全为 1，即 1 左移 n - 1 位
        int res = m * (1 << (n - 1));
        for (int i = 1; i < n; i++) {
            int nOnes = 0;
            for (int[] ints : A) {
                if (ints[0] == 1) {
                    nOnes += ints[i];
                } else {
                    nOnes += (1 - ints[i]);
                }
            }
            int j = Math.max(nOnes, m - nOnes);
            res += j * (1 << (n - i - 1));
        }
        return res;
    }
}
