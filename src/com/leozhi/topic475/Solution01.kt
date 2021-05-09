package com.leozhi.topic475

import kotlin.math.max

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 3348ms
 */
class Solution01 {
    fun findRadius(houses: IntArray, heaters: IntArray): Int {
        var min = 0
        var max = max(houses.maxOrNull() ?: 0, heaters.maxOrNull() ?: 0)
        while (min < max) {
            val mid = min + (max - min) / 2
            if (canCover(houses, heaters, mid)) {
                max = mid
            } else {
                min = mid + 1
            }
        }
        return min
    }

    private fun canCover(houses: IntArray, heaters: IntArray, radius: Int): Boolean {
        val houseCount = houses.size
        val heaterCount = heaters.size
        for (i in 0 until houseCount) {
            val start = houses[i] - radius
            val end = houses[i] + radius
            var canCover = false
            for (j in 0 until heaterCount) {
                if (heaters[j] in start..end) {
                    canCover = true
                    break
                }
            }
            if (!canCover) {
                return false
            }
        }
        return true
    }
}