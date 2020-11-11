package com.leozhi.topic31;

import java.util.Arrays;

/**
 * @author leozhi
 * 两次扫描
 * 通过
 * 1ms
 */
class Solution01 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int left = n - 2, right = n - 1;
        for (; left >= 0; left--, right--) {
            if (nums[right] > nums[left]) {
                break;
            }
        }
        if (left < 0) {
            Arrays.sort(nums);
            return;
        }
        for (int i = n - 1; i > right; i--) {
            if (nums[i] > nums[left] && nums[i] < nums[right]) {
                right = i;
                break;
            }
        }
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        Arrays.sort(nums, left + 1, n);
    }
}