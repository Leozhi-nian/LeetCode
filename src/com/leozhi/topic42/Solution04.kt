package com.leozhi.topic42

import kotlin.math.max
import kotlin.math.min

/**
 * @author leozhi
 * 暴力枚举
 * 通过
 * 340ms
 */
class Solution04 {
    fun trap(height: IntArray): Int {
        val len = height.size
        var res = 0
        var leftMax: Int
        var rightMax: Int
        for (i in 1 until len - 1) {
            leftMax = 0
            rightMax = 0
            for (j in 0 until i + 1) {
                leftMax = max(leftMax, height[j])
            }
            for (j in i until len) {
                rightMax = max(rightMax, height[j])
            }
            res += min(leftMax, rightMax) - height[i]
        }
        return res
    }
}