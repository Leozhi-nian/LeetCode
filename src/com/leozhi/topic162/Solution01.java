package com.leozhi.topic162;

/**
 * @author leozhi
 * 线性扫描
 * 通过
 * 0ms
 */
public class Solution01 {
    public int findPeakElement(int[] nums) {
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[res]) {
                res = i;
            }
        }
        return res;
    }
}
