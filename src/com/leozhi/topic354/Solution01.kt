package com.leozhi.topic354

import kotlin.math.max

/**
 * @author leozhi
 * 编译不通过，LeetCode Kotlin 版本不支持
 */
class Solution01 {
    fun maxEnvelopes(envelopes: Array<IntArray>): Int {
        val size = envelopes.size
        if (size <= 1) {
            return size
        }
        envelopes.sortWith { o1, o2 ->
            if (o1[0] == o2[0]) {
                o2[1] - o1[1]
            } else {
                o1[0] - o2[0]
            }
        }
        val dp = IntArray(size) { 1 }
        for (i in 0 until size) {
            for (j in 0 until i) {
                if (envelopes[i][1] > envelopes[j][1]) {
                    dp[i] = max(dp[i], dp[j] + 1)
                }
            }
        }
        return dp.maxOrNull()!!
    }
}