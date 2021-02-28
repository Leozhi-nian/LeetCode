package com.leozhi.topic896

/**
 * @author leozhi
 * 一次遍历
 * 通过
 * 364ms
 */
class Solution01 {
    fun isMonotonic(A: IntArray): Boolean {
        if (A.size <= 2) {
            return true
        }
        var i = 1
        while (i < A.size - 1 && A[i] - A[i - 1] == 0) {
            ++i
        }
        val first = A[i] - A[i - 1] > 0
        for (j in i + 1 until A.size) {
            val diff = A[j] - A[j - 1]
            if (diff > 0 != first && diff != 0) {
                return false
            }
        }
        return true
    }
}