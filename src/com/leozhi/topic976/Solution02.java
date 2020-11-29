package com.leozhi.topic976;

import java.util.Arrays;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 9ms
 */
public class Solution02 {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }
        }
        return 0;
    }
}
