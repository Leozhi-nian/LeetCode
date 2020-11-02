package com.leozhi.topic349;

import java.util.Arrays;

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 3ms
 */
class Solution02 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }
        int[] temp = new int[nums1.length];
        int index = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 0; i < nums1.length; i++) {
            if (i > 0 && nums1[i] == nums1[i - 1]) {
                continue;
            }
            int left = 0, right = nums2.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums2[mid] == nums1[i]) {
                    temp[index] = nums1[i];
                    index++;
                    break;
                } else if (nums2[mid] > nums1[i]) {
                    right = mid - 1;
                } else if (nums2[mid] < nums1[i]) {
                    left = mid + 1;
                }
            }
        }
        int[] res = new int[index];
        System.arraycopy(temp, 0, res, 0, index);
        return res;
    }
}