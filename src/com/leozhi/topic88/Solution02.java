package com.leozhi.topic88;

import java.util.Arrays;

/**
 * @author leozhi
 * 合并后排序
 * 官方题解
 * 通过
 * 1ms
 */
public class Solution02 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
