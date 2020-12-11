package com.leozhi.topic42

import kotlin.math.max

/**
 * @author leozhi
 * 双指针
 * 通过
 * 208ms
 */
class Solution06 {
    fun trip(height: IntArray): Int {
        val len = height.size
        if (len == 0) {
            return 0
        }
        var left = 0
        var right = len - 1
        var res = 0
        var leftMax = height[0]
        var rightMax = height[len - 1]
        while (left <= right) {
            leftMax = max(leftMax, height[left])
            rightMax = max(rightMax, height[right])
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