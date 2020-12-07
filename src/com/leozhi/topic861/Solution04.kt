package com.leozhi.topic861

import kotlin.math.max

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 208ms
 */
class Solution04 {
    fun matrixScore(A: Array<IntArray>): Int {
        val m = A.size
        val n = A[0].size
        var res = m * (1.shl(n - 1))
        for (i in 1 until n) {
            var nOnes = 0
            for (ints in A) {
                if (ints[0] == 1) {
                    nOnes += ints[i]
                } else {
                    nOnes += (1 - ints[i])
                }
            }
            val max = max(nOnes, m - nOnes)
            res += max * (1.shl(n - i - 1))
        }
        return res
    }
}