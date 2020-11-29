package com.leozhi.topic976;

import java.util.Arrays;

/**
 * @author leozhi
 * 暴力枚举
 * 通过
 * 792ms
 */
public class Solution01 {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int shortest = A[0], middle = A[1], longest = A[2], len = A.length, res;
        if (shortest + middle > longest && longest - middle < shortest) {
            res = shortest + middle + longest;
        } else {
            res = 0;
        }
        for (int i = 0; i < len - 2; i++) {
            middle = A[i + 1];
            longest = A[i + 2];
            for (int j = i + 3; j < len; j++) {
                if (longest + middle > A[j] && A[j] - longest < middle) {
                    shortest = middle;
                    middle = longest;
                    longest = A[j];
                    res = shortest + middle + longest;
                } else {
                    break;
                }
            }
        }
        return res;
    }
}
