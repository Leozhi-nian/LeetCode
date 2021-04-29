package com.leozhi.topic633

import kotlin.math.sqrt

/**
 * @author leozhi
 * 左右指针
 * 通过
 * 188ms
 */
class Solution03 {
    fun judgeSquareSum(c: Int): Boolean {
        val len = sqrt(c.toDouble()).toInt() + 1
        val pow = IntArray(len)
        for (i in 0 until len) {
            pow[i] = i * i
        }
        var left = 0
        var right = len - 1
        while (left <= right) {
            when {
                pow[left] + pow[right] == c -> {
                    return true
                }
                pow[left] + pow[right] < c -> {
                    ++left
                }
                else -> {
                    --right
                }
            }
        }
        return false
    }
}