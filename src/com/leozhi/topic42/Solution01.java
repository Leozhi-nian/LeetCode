package com.leozhi.topic42;

/**
 * @author leozhi
 * 暴力枚举
 * 通过
 * 89ms
 */
public class Solution01 {
    public int trap(int[] height) {
        int res = 0, leftMax, rightMax;
        for (int i = 1; i < height.length - 1; i++) {
            leftMax = 0;
            rightMax = 0;
            for (int j = i; j >= 0; j--) {
                leftMax = Math.max(leftMax, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            res += Math.min(leftMax, rightMax) - height[i];
        }
        return res;
    }
}
