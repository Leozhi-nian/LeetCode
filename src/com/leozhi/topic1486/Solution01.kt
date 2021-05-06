package com.leozhi.topic1486

/**
 * @author leozhi
 * 模拟
 * 通过
 * 148ms
 */
class Solution01 {
    fun xorOperation(n: Int, start: Int): Int {
        var res = 0
        for (i in 0 until n) {
            res = res.xor(start + 2 * i)
        }
        return res
    }
}