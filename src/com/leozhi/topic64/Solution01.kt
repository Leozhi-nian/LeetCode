package com.leozhi.topic64

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 232ms
 */
class Solution01 {
    fun minPathSum(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val dp = Array(m) { IntArray(n) }
        dp[0][0] = grid[0][0]
        for (i in 1 until n) {
            dp[0][i] = dp[0][i - 1] + grid[0][i]
        }
        for (i in 1 until m) {
            dp[i][0] = dp[i - 1][0] + grid[i][0]
            for (j in 1 until n) {

                dp[i][j] = grid[i][j] + if (dp[i - 1][j] < dp[i][j - 1]) dp[i - 1][j] else dp[i][j - 1]
            }
        }
        return dp[m - 1][n - 1]
    }
}