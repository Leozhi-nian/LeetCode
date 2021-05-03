package com.leozhi.topic7

/**
 * @author leozhi
 * 字符串
 * 通过
 * 196ms
 */
class Solution04 {
    fun reverse(x: Int): Int {
        var xString = x.toString()
        val res = StringBuilder()
        xString = if (x < 0) {
            res.append("-")
            xString.substring(1).reversed()
        } else {
            xString.reversed()
        }
        res.append(xString)
        val reverse = res.toString().toLong()
        if (reverse > Int.MAX_VALUE || reverse < Int.MIN_VALUE) {
            return 0
        }
        return reverse.toInt()
    }
}