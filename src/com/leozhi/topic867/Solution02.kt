package com.leozhi.topic867

/**
 * @author leozhi
 * 模拟
 * 通过
 * 252ms
 */
class Solution02 {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val row = matrix[0].size
        val column = matrix.size
        val res = Array(row) { IntArray(column) }
        for (i in 0 until row) {
            for (j in 0 until column) {
                res[i][j] = matrix[j][i]
            }
        }
        return res
    }
}