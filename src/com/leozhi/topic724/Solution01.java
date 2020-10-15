package com.leozhi.topic724;

/**
 * @author leozhi
 * 通过
 */
public class Solution01 {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int sum = 0, leftSum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (2 * leftSum == sum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
