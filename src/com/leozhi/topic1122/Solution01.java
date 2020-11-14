package com.leozhi.topic1122;

import java.util.Arrays;

/**
 * @author leozhi
 * 暴力
 * 通过
 * 5ms
 */
public class Solution01 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;
        int p = 0;
        for (int k : arr2) {
            while (p < m) {
                if (arr1[p] == k) {
                    p++;
                } else {
                    break;
                }
            }
            for (int j = p + 1; j < m; j++) {
                if (arr1[j] == k) {
                    int temp = arr1[j];
                    arr1[j] = arr1[p];
                    arr1[p] = temp;
                    p++;
                }
            }
        }
        Arrays.sort(arr1, p + 1, m);
        return arr1;
    }
}
