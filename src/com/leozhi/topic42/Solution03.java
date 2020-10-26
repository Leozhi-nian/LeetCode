package com.leozhi.topic42;

/**
 * @author leozhi
 * 左右指针
 * 通过
 * 1ms
 */
public class Solution03 {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }
        int left = 0, right = n - 1, res = 0;
        int leftMax = height[0], rightMax = height[n - 1];
        while (left <= right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (leftMax < rightMax) {
                res += leftMax - height[left];
                left++;
            } else {
                res += rightMax - height[right];
                right--;
            }
        }
        return res;
    }
}
