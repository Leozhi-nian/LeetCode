package com.leozhi.offer53_I;

/**
 * @author leozhi
 * 二分查找 左右边界
 * 通过
 * 0ms
 */
public class Solution02 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0, right = nums.length - 1, mid = 0, count = 0;
        // 寻找左边界
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        int leftBound = left;
        right = nums.length - 1;
        // 寻找右边界
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right - leftBound + 1;
    }
}
