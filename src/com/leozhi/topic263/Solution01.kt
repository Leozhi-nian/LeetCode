package com.leozhi.topic263

/**
 * @author leozhi
 * 数学
 * 通过
 * 160ms
 */
class Solution01 {
    fun isUgly(n: Int): Boolean {
        if (n <= 0) {
            return false
        }
        var num = n
        val array = intArrayOf(5, 3, 2)
        while (num > 2) {
            var divisor = 1
            for (ele in array) {
                if (num % ele == 0) {
                    divisor = ele
                    break
                }
            }
            if (divisor == 1) {
                return false
            }
            num /= divisor
        }
        return true
    }
}