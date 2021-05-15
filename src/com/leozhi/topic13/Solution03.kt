package com.leozhi.topic13

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 240ms
 */
class Solution03 {
    fun romanToInt(s: String): Int {
        val len = s.length
        val map = hashMapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        var res = 0
        for (i in 0 until len) {
            res += map[s[i]] ?: 0
            if (i > 0) {
                when {
                    s[i - 1] == 'I' && (s[i] == 'V' || s[i] == 'X') -> res -= 2
                    s[i - 1] == 'X' && (s[i] == 'L' || s[i] == 'C') -> res -= 20
                    s[i - 1] == 'C' && (s[i] == 'D' || s[i] == 'M') -> res -= 200
                }
            }
        }
        return res
    }
}

fun main() {
    for (i in 1..3999) {
        println(i)
    }
}