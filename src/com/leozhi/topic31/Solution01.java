package com.leozhi.topic31;

import java.util.Arrays;

/**
 * @author leozhi
 */
public class Solution01 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = 0;
        int right = n - 1;
        for (int left = right - 1; left >=0; left--) {
            if (nums[right] > nums[left]) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                index = left + 1;
                break;
            }
            if (left == 0) {
                right--;
                left = right - 1;
            }
        }
        Arrays.sort(nums, index, nums.length);
    }
}
