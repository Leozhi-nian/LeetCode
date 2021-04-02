package com.leozhi.interview1721

/**
 * @author leozhi
 * 双指针
 * 通过
 * 212ms
 */
class Solution01 {
    fun trap(height: IntArray): Int {
        var res = 0
        val len = height.size
        if (len == 0) {
            return res
        }
        var left = 0
        var right = len - 1
        var leftMax = height[left]
        var rightMax = height[right]
        while (left <= right) {
            leftMax = if (height[left] > leftMax) height[left] else leftMax
            rightMax = if (height[right] > rightMax) height[right] else rightMax
            if (leftMax < rightMax) {
                res += leftMax - height[left]
                ++left
            } else {
                res += rightMax - height[right]
                --right
            }
        }
        return res
    }
}