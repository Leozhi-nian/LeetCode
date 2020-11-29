package com.leozhi.topic976

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 292ms
 */
class Solution03 {
    fun largestPerimeter(A: IntArray): Int {
        A.sort()
        for (i in A.size - 1 downTo 2) {
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i]
            }
        }
        return 0
    }
}