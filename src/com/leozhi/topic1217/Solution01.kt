package com.leozhi.topic1217

import com.leozhi.testcase.array.convertToString
import com.leozhi.testcase.array.createIntArray

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 188ms
 */
class Solution01 {
    fun minCostToMoveChips(position: IntArray): Int {
        val len = position.size
        var even = 0
        var odd = 0
        for (i in 0 until len) {
            if (position[i].and(1) == 0) {
                ++odd
            } else {
                ++even
            }
        }
        return if (odd < even) odd else even
    }
}

fun main() {
    createIntArray(10, 100, 1).convertToString().let(::println)
    val solution = Solution01()
    solution.minCostToMoveChips(createIntArray(10, 100, 1))
}