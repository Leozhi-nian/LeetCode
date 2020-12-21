package com.leozhi.topic746

import kotlin.math.min

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 220ms
 */
class Solution03 {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val len = cost.size
        var prev = 0
        var cur = 0
        for (i in 2 until len) {
            val next = min(cur + cost[i - 1], prev + cost[i - 2])
            prev = cur
            cur = next
        }
        return cur
    }
}