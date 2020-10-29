package com.leozhi.topic88;

import java.util.Arrays;

/**
 * @author leozhi
 * 合并后排序
 * 通过
 * 1ms
 */
public class Solution01 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }
}
