package com.leozhi.topic1738

/**
 * @author leozhi
 * 前缀和
 * 通过
 * 2584ms
 */
class Solution01 {
    fun kthLargestValue(matrix: Array<IntArray>, k: Int): Int {
        val m = matrix.size
        val n = matrix[0].size
        val position = Array(m * n) { Triple(0, 0, 0) }
        for (i in 0 until m) {
            for (j in 0 until n) {
                val pos = when {
                    i == 0 && j == 0 -> matrix[i][j]
                    i == 0 -> position[i * n + j - 1].first.xor(matrix[i][j])
                    j == 0 -> position[(i - 1) * n + j].first.xor(matrix[i][j])
                    else -> position[(i - 1) * n + j].first.xor(position[i * n + j - 1].first).xor(position[(i - 1) * n + j - 1].first).xor(matrix[i][j])
                }
                position[i * n + j] = Triple(pos, i, j)
            }
        }
        position.sortByDescending { it.first }
        return position[k - 1].first
    }
}

fun main() {
    val solution = Solution01()
    solution.kthLargestValue(arrayOf(intArrayOf(10,9,5), intArrayOf(2,0,4), intArrayOf(1,0,9), intArrayOf(3,4,8)), 1)
}