package com.leozhi.topic201

/**
 * @author leozhi
 * 位移
 * 官方题解
 * 通过
 * 224ms
 */
class Solution02 {
    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        var l = left
        var r = right
        var shift = 0
        while (l < r) {
            l = l.shr(1)
            r = r.shr(1)
            ++shift
        }
        return l.shl(shift)
    }
}