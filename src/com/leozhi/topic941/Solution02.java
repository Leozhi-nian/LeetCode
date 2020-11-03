package com.leozhi.topic941;

/**
 * @author leozhi
 * 线性扫描
 * 官方题解
 * 通过
 * 1ms
 */
public class Solution02 {
    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;
        // 递增扫描
        while (i + 1 < N && A[i] < A[i + 1]) {
            i++;
        }
        // 最高点不能是数组的第一个位置或最后一个位置
        if (i == 0 || i == N - 1) {
            return false;
        }
        // 递减扫描
        while (i + 1 < N && A[i] > A[i + 1]) {
            i++;
        }
        return i == N - 1;
    }
}
