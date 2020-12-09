package com.leozhi.topic62

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 152ms
 */
class Solution02 {
    fun uniquePaths(m: Int, n: Int): Int {
        val position = Array(m) {IntArray(n)}
        for (i in 0 until m) {
            position[i][0] = 1
        }
        for (i in 0 until n) {
            position[0][i] = 1
        }
        for (i in 1 until m) {
            for (j in 1 until n) {
                position[i][j] = position[i - 1][j] + position[i][j - 1]
            }
        }
        return position[m - 1][n - 1]
    }
}