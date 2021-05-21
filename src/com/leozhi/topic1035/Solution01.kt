package com.leozhi.topic1035

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 192ms
 */
class Solution01 {
    fun maxUncrossedLines(nums1: IntArray, nums2: IntArray): Int {
        val m = nums1.size
        val n = nums2.size
        val dp = Array(m + 1) { IntArray(n + 1) }
        for (i in 1..m) {
            val num1 = nums1[i - 1]
            for (j in 1..n) {
                val num2 = nums2[j - 1]
                if (num1 == num2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1
                } else {
                    dp[i][j] = if (dp[i - 1][j] > dp[i][j - 1]) dp[i - 1][j] else dp[i][j - 1]
                }
            }
        }
        return dp[m][n]
    }
}