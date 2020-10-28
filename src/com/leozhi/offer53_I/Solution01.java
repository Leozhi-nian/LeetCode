package com.leozhi.offer53_I;

/**
 * @author leozhi
 * 二分查找 左边界
 * 通过
 * 1ms
 */
public class Solution01 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0, right = nums.length - 1, mid = 0;
        // 寻找左边界
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (nums[left] != target) {
            return 0;
        }
        int count = 0;
        for (int i = left; i < nums.length; i++) {
            if (nums[i] == nums[left]) {
                count++;
            }
        }
        return count;
    }
}
