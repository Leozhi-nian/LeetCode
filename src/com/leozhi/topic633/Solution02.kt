package com.leozhi.topic633

import kotlin.math.sqrt

/**
 * @author leozhi
 * 左右指针
 * 通过
 * 172ms
 */
class Solution02 {
    fun judgeSquareSum(c: Int): Boolean {
        // val pow = IntArray(Math.sqrt(c.toDouble()).toInt() + 1)
        val pow = IntArray(sqrt(c.toDouble()).toInt() + 1)
        var i = 0
        while (i * i in 0..c) {
            pow[i] = i * i
            ++i
        }
        var left = 0
        var right = pow.size - 1
        while (left <= right) {
            if (pow[left] + pow[right] == c) {
                return true
            } else if (pow[left] + pow[right] < c) {
                ++left
            } else if (pow[left] + pow[right] > c) {
                --right
            }
        }
        return false
    }
}