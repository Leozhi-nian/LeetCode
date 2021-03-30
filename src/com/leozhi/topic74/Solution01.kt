package com.leozhi.topic74

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 212ms
 */
class Solution01 {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val m = matrix.size
        val n = matrix[0].size
        var leftRow = 0
        var rightRow = m - 1
        var leftColumn = 0
        var rightColumn = n - 1
        while (leftRow <= rightRow && leftColumn <= rightColumn) {
            val midRow = leftRow + (rightRow - leftRow) / 2
            val midColumn = leftColumn + (rightColumn - leftColumn) / 2
            if (target == matrix[midRow][midColumn]) {
                return true
            } else if (target > matrix[midRow][midColumn]) {
                if (midRow + 1 < m && target >= matrix[midRow + 1][0]) {
                    leftRow = midRow + 1
                } else {
                    leftColumn = midColumn + 1
                }
            } else if (target < matrix[midRow][midColumn]) {
                if (midRow > 0 && target <= matrix[midRow - 1][n - 1]) {
                    rightRow = midRow - 1
                } else {
                    rightColumn = midColumn - 1
                }
            }
        }
        return false
    }
}