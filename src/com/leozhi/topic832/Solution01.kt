package com.leozhi.topic832

/**
 * @author leozhi
 * 双指针
 * 通过
 * 276ms
 */
class Solution01 {
    fun flipAndInvertImage(A: Array<IntArray>): Array<IntArray> {
        val row = A.size
        val column = A[0].size
        var left: Int
        var right: Int
        for (i in 0 until row) {
            left = 0
            right = column - 1
            while (left <= right) {
                val temp = A[i][left]
                A[i][left++] = A[i][right].xor(1)
                A[i][right--] = temp.xor(1)
            }
        }
        return A
    }
}