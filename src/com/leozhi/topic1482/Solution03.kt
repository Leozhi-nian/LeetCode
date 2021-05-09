package com.leozhi.topic1482

import com.leozhi.testcase.array.convertToString
import com.leozhi.testcase.array.createIntArray
import kotlin.random.Random

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 604ms
 */
class Solution03 {
    fun minDays(bloomDay: IntArray, m: Int, k: Int): Int {
        val len = bloomDay.size
        if (m * k > len) return -1
        var min = 0
        var max = bloomDay.maxOrNull() ?: 0
        while (min <= max) {
            val mid = min + (max - min) / 2
            if (canMake(mid, bloomDay, m, k)) {
                max = mid - 1
            } else {
                min = mid + 1
            }
        }
        if (canMake(min, bloomDay, m, k)) {
            return min
        }
        return -1
    }

    private fun canMake(days: Int, bloomDay: IntArray, m: Int, k: Int): Boolean {
        val len = bloomDay.size
        var flowerCount = 0
        var bundle = 0
        for (i in 0 until len) {
            if (bloomDay[i] <= days) {
                ++flowerCount
            } else {
                flowerCount = 0
            }
            if (flowerCount == k) {
                flowerCount = 0
                ++bundle
            }
        }
        if (bundle >= m) {
            return true
        }
        return false
    }
}

fun main() {
    val array = intArrayOf(1,10,3,10,2)
    val solution = Solution03()
    solution.minDays(array, 3, 1)
    for (i in 0..100) {
        createIntArray(1000, 1000000000, 1 ).convertToString().let(::println)
        Random.nextInt(1000000).let(::println)
        Random.nextInt(1000).let(::println)
    }
}