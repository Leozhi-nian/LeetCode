package com.leozhi.topic697

import kotlin.math.min

/**
 * @author leozhi
 * 一次遍历
 * 通过
 * 340ms
 */
class Solution01 {
    fun findShortestSubArray(nums: IntArray): Int {
        val start = HashMap<Int, Int>()
        val count = HashMap<Int, Int>()
        var degree = 0
        var res = 50000
        for ((index, num) in nums.withIndex()) {
            if (!start.containsKey(num)) {
                start[num] = index
            }
            count[num] = count.getOrDefault(num, 0) + 1
            val n = count[num]!!
            degree = if (degree > n) {
                degree
            } else if (degree == n) {
                res = min(res, index - start[num]!! + 1)
                degree
            } else {
                res = index - start[num]!! + 1
                n
            }
        }
        return res
    }
}