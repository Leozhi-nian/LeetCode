package com.leozhi.topic201

/**
 * @author leozhi
 * 位运算
 * 通过
 * 576ms
 */
class Solution01 {
    fun rangeBitWiseAnd(left: Int, right: Int): Int {
        if (left == right) return left
        var res = left
        for (i in left + 1..right) {
            if (res == 0) {
                return 0
            }
            res = res.and(i)
        }
        return res
    }
}