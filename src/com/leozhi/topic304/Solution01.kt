package com.leozhi.topic304

/**
 * @author leozhi
 * 暴力枚举
 * 通过
 * 708ms
 */
class NumMatrix(matrix: Array<IntArray>) {
    val matrix = matrix
    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        var res = 0
        for (i in row1..row2) {
            for (j in col1..col2) {
                res += matrix[i][j]
            }
        }
        return res
    }
}