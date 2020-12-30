package com.leozhi.topic11;

/**
 * @author leozhi
 * 暴力枚举
 * 通过
 * 1056ms
 */
public class Solution01 {
    public int maxArea(int[] height) {
        int left = 0, right = 1, len = height.length, res = 0;
        while (left < len) {
             while (right < len) {
                 res = Math.max(res, Math.min(height[left], height[right]) * (right - left));
                 ++right;
             }
             ++left;
             right = left + 1;
        }
        return res;
    }
}
