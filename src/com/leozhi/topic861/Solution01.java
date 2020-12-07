package com.leozhi.topic861;

/**
 * @author leozhi
 * 暴力
 * 通过
 * 1ms
 */
public class Solution01 {
    public int matrixScore(int[][] A) {
        int m = A.length, n = A[0].length;
        int[] count = new int[n];
        // 先判断每一行第一个元素是否为 1
        // 如果为 1，则不移动，否则横向移动
        for (int i = 0; i < m; i++) {
            boolean isZero = A[i][0] == 0;
            for (int j = 0; j < n; j++) {
                if (isZero) {
                    A[i][j] ^= 1;
                }
                // 统计每一列中 1 出现的次数
                count[j] += A[i][j];
            }
        }
        // 比较每一列中 0 和 1 出现的次数
        // 如果 1 出现的次数小于 0 出现的次数，则纵向移动
        for (int i = 1; i < n; i++) {
            if (count[i] < m - count[i]) {
                for (int j = 0; j < m; j++) {
                    A[j][i] ^= 1;
                }
            }
        }
        int res = 0;
        // 求和
        for (int[] ints : A) {
            for (int j = 0; j < n; j++) {
                if (ints[j] == 1) {
                    res += Math.pow(2, n - j - 1);
                }
            }
        }
        return res;
    }
}
