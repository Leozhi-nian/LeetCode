package com.leozhi.topic50

/**
 * @author leozhi
 * 快速幂 + 递归
 * 通过
 * 192ms
 */
class Solution01 {
    fun myPow(x: Double, n: Int): Double {
        return if (n >= 0) {
            pow(x, n)
        } else {
            1 / pow(x, -n)
        }

    }

    private fun pow(x: Double, n: Int): Double {
        if (n == 0) {
            return 1.0
        }
        val res = pow(x, n / 2)
        return if (n % 2 == 0) {
            res * res
        } else {
            res * res * x
        }
    }
}