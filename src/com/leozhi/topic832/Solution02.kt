package com.leozhi.topic832

/**
 * @author leozhi
 * 双指针
 * 通过
 * 244ms
 */
class Solution02 {
    fun flipAndInvertImage(A: Array<IntArray>): Array<IntArray> {
        val row = A.size
        val column = A[0].size
        var left: Int
        var right: Int
        for (i in 0 until row) {
            left = 0
            right = column - 1
            while (left < right) {
                if (A[i][left] == A[i][right]) {
                    A[i][left] = A[i][left].xor(1)
                    A[i][right] = A[i][right].xor(1)
                }
                ++left
                --right
            }
            if (left == right) {
                A[i][left] = A[i][left].xor(1)
            }
        }
        return A
    }
}