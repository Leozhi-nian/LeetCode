package com.leozhi.topic403

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 776ms
 */
class Solution01 {
    fun canCross(stones: IntArray): Boolean {
        if (stones[1] != 1) {
            return false
        }
        val len = stones.size
        val dp = Array(len) { IntArray(len) }
        dp[1][1] = 1
        for (i in 1 until len) {
            for (j in 1 until len) {
                if (dp[i][j] == 1) {
                    for (k in j - 1..j + 1) {
                        if (k <= 0) {
                            continue
                        }
                        if (stones[i] + k in stones) {
                            val index = stones.indexOf(stones[i] + k)
                            dp[index][k] = 1
                        }
                    }
                }
            }
        }
        for (i in 1 until len) {
            if (dp[len - 1][i] == 1) {
                return true
            }
        }
        return false
    }
}