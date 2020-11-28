package com.leozhi.topic493;

/**
 * @author leozhi
 * 暴力枚举
 * 超出时间限制
 */
public class Solution01 {
    public int reversePairs(int[] nums) {
        int len = nums.length, res = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if ((nums[i] + 1) / 2 > nums[j]) {
                    res++;
                }
            }
        }
        return res;
    }
}
