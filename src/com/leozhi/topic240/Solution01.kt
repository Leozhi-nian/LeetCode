package com.leozhi.topic240

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 356ms
 */
class Solution01 {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val row = matrix.size
        for (i in 0 until row) {
            if (binarySearch(matrix, target, i, matrix[0].size)) {
                return true
            }
        }
        return false
    }

    private fun binarySearch(matrix: Array<IntArray>, target: Int, row: Int, column: Int): Boolean {
        var left = 0
        var right = column - 1
        while (left < right) {
            val mid = left + (right - left) / 2
            when {
                matrix[row][mid] == target -> {
                    return true
                }
                matrix[row][mid] > target -> {
                    right = mid
                }
                matrix[row][mid] < target -> {
                    left = mid + 1
                }
            }
        }
        return matrix[row][left] == target
    }
}