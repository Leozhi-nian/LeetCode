package com.leozhi.topic461

/**
 * @author leozhi
 * 位运算
 * 通过
 * 168ms
 */
class Solution02 {
    fun hammingDistance(x: Int, y: Int): Int {
        var diff = x.xor(y)
        var res = 0
        while (diff != 0) {
            res += diff.and(1)
            diff = diff.shr(1)
        }
        return res
    }
}