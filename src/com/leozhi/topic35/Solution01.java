package com.leozhi.topic35;

/**
 * @author leozhi
 * 二分查找
 * 通过
 */
public class Solution01 {
    public int searchInsert(int[] nums, int target) {
        // 区间两端闭合，即[0, nums.length - 1]
        int left = 0, right = nums.length - 1;
        // 终止条件，搜索区间为空，即left = right + 1，[right + 1, right]
        while (left <= right) {
            // left + (right - left) 防止溢出，left + right / 2中的left + right可能溢出
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return left;
    }
}
