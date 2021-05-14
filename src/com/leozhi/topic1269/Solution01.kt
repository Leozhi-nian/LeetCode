package com.leozhi.topic1269

import kotlin.math.pow

/**
 * @author leozhi
 * 动态规划
 * 超出内存限制
 */
class Solution01 {
    fun numWays(steps: Int, arrLen: Int): Int {
        if (arrLen == 1) return 1
        if (arrLen == 2) return 2.0.pow((arrLen - 2).toDouble()).toInt()
        val dp = Array(3) { LongArray(steps + 1) }
        dp[0][0] = 1
        for (j in 1..steps) {
            if (j < arrLen) dp[j][j] = 1
            for (i in (if (j - 1 < arrLen - 1) j - 1 else arrLen - 1) downTo 0) {
                dp[i][j] = ((if (i < arrLen - 1) dp[i + 1][j - 1] else 0) + dp[i][j - 1] + if (i > 0) dp[i - 1][j - 1] else 0) % (1000000007)
            }
        }
        return dp[0][steps].toInt()
    }
}

fun main() {
    val solution = Solution01()
    solution.numWays(7, 2)
    for (i in 1..500) {
        println(i)
        println(2)
    }
}