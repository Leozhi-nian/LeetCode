package com.leozhi.topic861

import kotlin.math.pow

/**
 * @author leozhi
 * 暴力
 * 通过
 * 176ms
 */
class Solution02 {
    fun matrixScore(A: Array<IntArray>): Int {
        val m = A.size
        val n = A[0].size
        val count = IntArray(n)
        for (i in 0 until m) {
            val isZero = A[i][0] == 0
            for (j in 0 until n) {
                if (isZero) {
                    A[i][j] = A[i][j].xor(1)
                }
                count[j] += A[i][j]
            }
        }
        for (i in 1 until n) {
            if (count[i] < m - count[i]) {
                for (j in 0 until m) {
                    A[j][i] = A[j][i].xor(1)
                }
            }
        }
        var res = 0
        for (ints in A) {
            for (i in 0 until n) {
                if (ints[i] == 1) {
                    res += 2.0.pow(n - i - 1).toInt()
                }
            }
        }
        return res
    }
}