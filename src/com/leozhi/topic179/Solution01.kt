package com.leozhi.topic179

import kotlin.Comparator

/**
 * @author leozhi
 * 排序
 * 官方题解
 * 通过
 * 236ms
 */
class Solution01 {
    fun largestNumber(nums: IntArray): String {
        val list = nums.sortedWith { x, y ->
            var sx = 10L
            var sy = 10L
            while (sx <= x) {
                sx *= 10
            }
            while (sy <= y) {
                sy *= 10
            }
            (-sy * x - y + sx * y + x).toInt()
        }
        if (list[0] == 0) {
            return "0"
        }
        val res = StringBuilder()
        for (num in list) {
            res.append(num)
        }
        return res.toString()
    }
}