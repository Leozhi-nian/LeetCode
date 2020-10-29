package com.leozhi.topic88;

/**
 * @author leozhi
 * 双指针
 * 通过
 * 0ms
 */
public class Solution03 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, index = nums1.length - 1;
        while (i >= 0 || j >= 0) {
            if (i < 0) {
                while (j >= 0) {
                    nums1[index] = nums2[j];
                    index--;
                    j--;
                }
                break;
            }
            if (j < 0) {
                break;
            }
            if (nums1[i] > nums2[j]) {
                nums1[index] = nums1[i];
                index--;
                i--;
            } else {
                nums1[index] = nums2[j];
                index--;
                j--;
            }
        }
    }
}
