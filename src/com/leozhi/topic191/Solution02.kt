package com.leozhi.topic191

/**
 * @author leozhi
 * 位运算
 * 通过
 * 168ms
 */
class Solution02 {
    fun hammingWeight(n:Int):Int {
        var num = n
        var res = 0
        while (num != 0) {
            num = num.and(num - 1)
            ++res
        }
        return res
    }
}