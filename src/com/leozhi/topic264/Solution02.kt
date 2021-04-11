package com.leozhi.topic264

import java.util.*
import kotlin.collections.HashSet

/**
 * @author leozhi
 * 最小堆
 * 官方题解
 * 通过
 * 480ms
 */
class Solution02 {
    fun nthUglyNumber(n: Int): Int {
        val factors = intArrayOf(2, 3, 5)
        val seen = HashSet<Long>()
        val heap = PriorityQueue<Long>()
        seen.add(1L)
        heap.offer(1L)
        var ugly = 0
        for (i in 0 until n) {
            val cur = heap.poll()
            ugly = cur.toInt()
            for (factor in factors) {
                val next = cur * factor
                if (seen.add(next)) {
                    heap.offer(next)
                }
            }
        }
        return ugly
    }
}