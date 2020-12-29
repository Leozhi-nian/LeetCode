package com.leozhi.topic330;

/**
 * @author leozhi
 * 贪心算法
 * 官方题解
 * 通过
 * 0ms
 */
public class Solution01 {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        long x = 1;
        int length = nums.length, index = 0;
        while (x <= n) {
            if (index < length && nums[index] <= x) {
                x += nums[index];
                index++;
            } else {
                x *= 2;
                patches++;
            }
        }
        return patches;
    }
}
