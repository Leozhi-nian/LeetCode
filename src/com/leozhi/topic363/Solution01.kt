package com.leozhi.topic363

import java.util.*

/**
 * @author leozhi
 * 有序集合
 * 通过
 * 460ms
 */
class Solution01 {
    fun maxSumSubmatrix(matrix: Array<IntArray>, k: Int): Int {
        var ans = Integer.MIN_VALUE
        val m = matrix.size
        val n = matrix[0].size
        for (i in 0 until m) {
            val sum = IntArray(n)
            for (j in i until m) {
                for (c in 0 until n) {
                    sum[c] += matrix[j][c]
                }
                val sumSet = TreeSet<Int>();
                sumSet.add(0)
                var s = 0
                for (v in sum) {
                    s += v
                    val ceil = sumSet.ceiling(s - k)
                    ceil?.let {
                        ans = if (ans > s - ceil) ans else s - ceil
                    }
                    sumSet.add(s)
                }
            }
        }
        return ans
    }
}