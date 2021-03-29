package com.leozhi.topic190

/**
 * @author leozhi
 * 位运算
 * 通过
 * 160ms
 */
class Solution02 {
    fun reverseBits(n:Int):Int {
        var reverse = 0
        var N = n
        for (i in 0 until 32) {
            reverse = reverse.shl(1)
            reverse += N.and(0x01)
            N = N.shr(1)
        }
        return reverse
    }
}