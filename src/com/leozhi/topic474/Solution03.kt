package com.leozhi.topic474

import kotlin.math.max

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 228ms
 */
class Solution03 {
    fun findMaxForm(strs: Array<String>, m: Int, n: Int): Int {
        val dp = Array(m + 1) { IntArray(n + 1) }
        for (str in strs) {
            val zeroCount = str.count { it == '0' }
            val oneCount = str.length - zeroCount
            for (i in m downTo zeroCount) {
                for (j in n downTo oneCount) {
                    dp[i][j] = max(dp[i][j], dp[i - zeroCount][j - oneCount] + 1)
                }
            }
        }
        return dp.last().last()
    }
}