package com.leozhi.topic34;

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 0ms
 */
public class Solution02 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = getBoundary(nums, target, true);
        ans[1] = getBoundary(nums, target, false);
        return ans;
    }

    private int getBoundary(int[] nums, int target, boolean isLeft) {
        int left = 0, right = nums.length - 1, mid, boundary = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                if (isLeft) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                boundary = mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return boundary;
    }
}
