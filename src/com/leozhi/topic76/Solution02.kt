package com.leozhi.topic76

/**
 * @author leozhi
 * 滑动窗口
 * 通过
 * 232ms
 */
class Solution02 {
    fun minWindow(s: String, t: String): String {
        val chars = IntArray(128)
        chars.fill(0)
        val flag = BooleanArray(128)
        flag.fill(false)
        for (i in t.indices) {
            flag[t[i].toInt()] = true
            ++chars[t[i].toInt()]
        }
        var left = 0
        var valid = 0
        var start = 0
        var len = s.length + 1
        for (right in s.indices) {
            if (flag[s[right].toInt()]) {
                if (--chars[s[right].toInt()] >= 0) {
                    ++valid
                }
                while (valid == t.length) {
                    if (right - left + 1 < len) {
                        start = left
                        len = right - left + 1
                    }
                    if (flag[s[left].toInt()] && ++chars[s[left].toInt()] > 0) {
                        --valid
                    }
                    ++left
                }
            }
        }
        return if (len > s.length) "" else s.substring(start, start + len)
    }
}