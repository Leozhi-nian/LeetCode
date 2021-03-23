package com.leozhi.topic231

/**
 * @author leozhi
 * Brian Kernighan 算法
 * 通过
 * 172ms
 */
class Solution01 {
    fun isPowerOfTwo(n: Int): Boolean {
        if (n < 0) {
            return false
        }
        return (n.and(n - 1) == 0)
    }
}