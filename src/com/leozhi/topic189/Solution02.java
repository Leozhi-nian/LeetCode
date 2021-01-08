package com.leozhi.topic189;

/**
 * @author leozhi
 * 数组拷贝
 * 通过
 * 50ms
 */
public class Solution02 {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            System.arraycopy(nums, 0, nums, 1, nums.length - 1);
            nums[0] = temp;
        }
    }
}
