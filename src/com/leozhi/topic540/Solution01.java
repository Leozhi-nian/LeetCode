package com.leozhi.topic540;

/**
 * @author leozhi
 * 位运算
 * 通过
 * 0ms
 */
public class Solution01 {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}
