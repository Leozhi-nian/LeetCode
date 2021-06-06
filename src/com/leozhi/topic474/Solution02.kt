package com.leozhi.topic474

import kotlin.math.max

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 2936ms
 */
class Solution02 {
    fun findMaxForm(strs: Array<String>, m: Int, n: Int): Int {
        val size = strs.size
        // 三维 dp 数组，一维代表前 i 个字符串，二维代表最多 j 个 0，三维代表最多 k 个 1
        val dp = Array(size + 1) { Array(m + 1) { IntArray(n + 1) } }
        for (i in 1..size) {
            for (j in 0..m) {
                for (k in 0..n) {
                    val zeroCount = strs[i - 1].replace("1", "").length
                    val oneCount = strs[i - 1].length - zeroCount
                    if (j - zeroCount < 0 || k - oneCount < 0) {
                        dp[i][j][k] = dp[i - 1][j][k]
                    } else {
                        dp[i][j][k] = max(dp[i - 1][j][k], dp[i - 1][j - zeroCount][k - oneCount] + 1)
                    }
                }
            }
        }
        return dp[size][m][n]
    }
}