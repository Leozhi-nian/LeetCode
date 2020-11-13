package com.leozhi.topic31;

import java.util.Arrays;

/**
 * @author leozhi
 * 两次扫描
 * 通过
 * 1ms
 */
public class Solution02 {
    public void nextPermutation(int[] nums) {
        int index = 0, n = nums.length;
        int i;
        for (i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                index = i - 1;
                break;
            }
        }
        if (i == 0) {
            Arrays.sort(nums);
            return;
        }
        for (int j = n - 1; j > index; j--) {
            if (nums[j] > nums[index]) {
                int temp = nums[j];
                nums[j] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        Arrays.sort(nums, index + 1, n);
    }
}
