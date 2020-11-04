package com.leozhi.topic4;

/**
 * @author leozhi
 * 合并数组
 * 通过
 * 3ms
 */
public class Solution01 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // nums1 和 nums2 元素个数之和的奇偶性
        int isOdd = (nums1.length + nums2.length) % 2;
        int index = (nums1.length + nums2.length) / 2;
        int p1 = 0, p2 = 0;
        double ans;
        int[] nums = new int[index + 1];
        for (int i = 0; i < index + 1; i++) {
            if (nums1.length == 0) {
                nums[i] = nums2[p2++];
            } else if (nums2.length == 0) {
                nums[i] = nums1[p1++];
            } else if (nums1.length > p1 && nums2.length > p2) {
                if (nums1[p1] <= nums2[p2]) {
                    nums[i] = nums1[p1++];
                } else {
                    nums[i] = nums2[p2++];
                }
            } else if (nums1.length > p1) {
                nums[i] = nums1[p1++];
            } else if (nums2.length > p2) {
                nums[i] = nums2[p2++];
            }
        }
        if (isOdd == 0) {
            ans = (nums[index - 1] + nums[index]) / 2.0;
        } else {
            ans = nums[index];
        }
        return ans;
    }
}
