package com.leozhi.topic350;

import java.util.Arrays;

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 6ms
 */
public class Solution02 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] res = new int[nums1.length];
        int len1 = 0, len2 = 0, index = 0;
        for (int i = 0; i < nums1.length; i++) {
            len1 = 1;
            len2 = 0;
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[j] == nums1[i]) {
                    len1++;
                    i = j;
                }
            }
            int left = 0, right = nums2.length, mid;
            // 获取左边界
            while (left < right) {
                mid = left + (right - left) / 2;
                if (nums2[mid] >= nums1[i]) {
                    right = mid;
                } else if (nums2[mid] < nums1[i]) {
                    left = mid + 1;
                }
            }
            for (int j = left; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    len2++;
                } else if (nums2[j] > nums1[i]) {
                    break;
                }
            }
            for (int j = 1; j <= Math.min(len1, len2); j++) {
                res[index++] = nums1[i];
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }
}
