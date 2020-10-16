package com.leozhi.topic977;

import java.util.Arrays;

/**
 * @author leozhi
 * 直接排序
 * 通过
 */
public class Solution01 {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
