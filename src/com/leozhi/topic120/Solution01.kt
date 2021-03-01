package com.leozhi.topic120

import kotlin.math.min

/**
 * @author leozhi
 * 动态规划 自底而上
 * 通过
 * 280ms
 */
class Solution01 {
    fun minimumTotal(triangle: List<List<Int>>): Int {
        val size = triangle.size
        val dp = Array(size) { IntArray(size) }
        dp[0][0] = triangle[0][0]
        for (i in 1 until size) {
            for (j in 0..i) {
                dp[i][j] = when (j) {
                    0 -> dp[i - 1][0] + triangle[i][j]
                    i -> dp[i - 1][i - 1] + triangle[i][j]
                    else -> min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j]
                }
            }
        }
        var res = Integer.MAX_VALUE
        for (i in 0 until size) {
            res = if (res < dp[size - 1][i]) res else dp[size - 1][i]
        }
        return res
    }
}