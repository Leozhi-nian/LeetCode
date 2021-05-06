package com.leozhi.topic1720

/**
 * @author leozhi
 * 位运算
 * 通过
 * 316ms
 */
class Solution02 {
    fun decode(encoded: IntArray, first: Int): IntArray {
        val len = encoded.size
        val arr = IntArray(len + 1)
        arr[0] = first
        for (i in 1..len) {
            arr[i] = encoded[i - 1].xor(arr[i - 1])
        }
        return arr
    }
}