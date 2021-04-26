package com.leozhi.topic1011

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 316ms
 */
class Solution02 {
    fun shipWithinDays(weights: IntArray, D: Int): Int {
        var left = weights.maxOrNull()!!
        var right = weights.sum() + 1
        while (left < right) {
            val mid = left + (right - left) / 2
            if (canFinish(weights, D, mid)) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left
    }

    private fun canFinish(weights: IntArray, D: Int, cap: Int): Boolean {
        var i = 0
        for (day in 0 until D) {
            var maxCap = cap
            while (maxCap - weights[i] >= 0) {
                maxCap -= weights[i]
               ++i
                if (i == weights.size) {
                    return true
                }
            }
        }
        return false
    }
}