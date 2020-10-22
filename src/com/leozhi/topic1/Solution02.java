package com.leozhi.topic1;

/**
 * @author leozhi
 * 暴力枚举
 * 通过
 * 69ms
 */
public class Solution02 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
