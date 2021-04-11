package com.leozhi.topic264

/**
 * @author leozhi
 * 暴力
 * 通过
 * 900ms
 */
class Solution01 {
    fun nthUglyNumber(n: Int): Int {
        val list = ArrayList<Long>()
        list.add(1)
        val factors = intArrayOf(2, 3, 5)
        var index = 0
        while (index < n) {
            for (factor in factors) {
                val value = list[index] * factor
                if (!list.contains(value)) {
                    list.add(value)
                }
            }
            ++index
            list.sort()
        }
        return list[n - 1].toInt()
    }
}