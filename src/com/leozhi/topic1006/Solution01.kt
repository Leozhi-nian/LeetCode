package com.leozhi.topic1006

/**
 * @author leozhi
 * 一次遍历
 * 通过
 * 164ms
 */
class Solution01 {
    fun clumsy(N: Int): Int {
        var n = N
        var res: Int = if (n - 3 >= 0) {
            n * (n - 1) / (n - 2) + (n - 3)
        } else {
            n
        }
        n -= 4
        while (n - 3 >= 0) {
            res -= n * (n - 1) / (n - 2) - (n - 3)
            n -= 4
        }
        if (n > 0) {
            res -= n
        }
        return res
    }
}