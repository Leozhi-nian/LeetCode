package com.leozhi.topic852;

/**
 * @author leozhi
 * 线性扫描
 * 通过
 * 0ms
 */
public class Solution01 {
    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return i - 1;
            }
        }
        return 0;
    }
}
