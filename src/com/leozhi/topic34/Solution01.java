package com.leozhi.topic34;

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 0ms
 */
public class Solution01 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        if (nums.length == 0) {
            return ans;
        }
        // 寻找左边界
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) >>> 2;
            if (nums[mid] == target) {
                right = mid;
                ans[0] = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        // 寻找右边界
        left = 0;
        right = nums.length;
        while (left < right) {
            int mid = (left + right) >>> 2;
            if (nums[mid] == target) {
                left = mid + 1;
                ans[1] = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }

        }
        return ans;
    }
}
