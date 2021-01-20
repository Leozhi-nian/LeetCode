package com.leozhi.topic628;

import java.util.Arrays;

/**
 * @author leozhi
 * 排序
 * 通过
 * 12ms
 */
public class Solution01 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int last = nums.length - 1, twoSum = 0;
        if (nums[last] >= 0) {
            twoSum = Math.max(nums[0] * nums[1], nums[last - 1] * nums[last - 2]);
        } else {
            twoSum = Math.min(nums[0] * nums[1], nums[last - 2] * nums[last - 1]);
        }
        return twoSum * nums[last];
    }
}
