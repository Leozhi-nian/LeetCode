package com.leozhi.topic338

/**
 * @author leozhi
 * Java API
 * 通过
 * 208ms
 */
class Solution01 {
    fun countBits(num: Int): IntArray {
        val res = IntArray(num + 1)
        for (i in 0..num) {
            res[i] = Integer.bitCount(i)
        }
        return res
    }
}