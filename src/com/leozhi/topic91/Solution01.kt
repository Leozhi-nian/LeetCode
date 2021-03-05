package com.leozhi.topic91

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 176ms
 */
class Solution01 {
    fun numDecodings(s: String): Int {
        if (s[0] == '0') {
            return 0
        }
        val len = s.length
        var pre = 1
        var cur = 1
        for (i in 1 until len) {
            val temp = cur
            if (s[i] == '0') {
                if (s[i - 1] == '1' || s[i - 1] == '2') {
                    cur = pre
                } else {
                    return 0
                }
            } else if (s[i - 1] == '1' || (s[i - 1] == '2' && s[i] in '1'..'6')) {
                cur += pre
            }
            pre = temp
        }
        return cur
    }
}