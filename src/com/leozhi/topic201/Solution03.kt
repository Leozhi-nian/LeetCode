package com.leozhi.topic201

/**
 * @author leozhi
 * Brian Kernighan 算法
 * 官方题解
 * 通过
 * 260ms
 */
class Solution03 {
    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        var r = right
        while (left < r) {
            r = r.and(r - 1)
        }
        return r
    }
}