package com.leozhi.topic42

import kotlin.math.max
import kotlin.math.min

/**
 * @author leozhi
 * 备忘录
 * 通过
 * 212ms
 */
class Solution05 {
    fun trap(height: IntArray): Int {
        val len = height.size
        if (len == 0) {
            return 0
        }
        val leftMax = IntArray(len)
        val rightMax = IntArray(len)
        leftMax[0] = height[0]
        rightMax[len - 1] = height[len - 1]
        var res = 0
        for (i in 1 until len) {
            leftMax[i] = max(height[i], leftMax[i - 1])
            rightMax[len - 1 - i] = max(height[len - 1 - i], rightMax[len - i])
        }
        for (i in 0 until len) {
            res += min(leftMax[i], rightMax[i]) - height[i]
        }
        return res
    }
}