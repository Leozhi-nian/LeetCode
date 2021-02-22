package com.leozhi.topic766

/**
 * @author leozhi
 * 遍历
 * 通过
 * 228ms
 */
class Solution01 {
    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        for ((i, array) in matrix.withIndex()) {
            for ((j, value) in array.withIndex()) {
                if (i != 0 && j != 0 && value != matrix[i - 1][j - 1]) {
                    return false
                }
            }
        }
        return true
    }
}