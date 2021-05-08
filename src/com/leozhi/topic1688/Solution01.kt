package com.leozhi.topic1688

/**
 * @author leozhi
 * 模拟
 * 通过
 * 176ms
 */
class Solution01 {
    fun numberOfMatches(n: Int): Int {
        var count = n
        var res = 0
        while (count != 1) {
            res += count / 2
            count = (count + 1) / 2
        }
        return res
    }
}

fun main() {
    for (i in 1..200) {
        println(i)
    }
}