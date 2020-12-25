package com.leozhi.topic455

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 284ms
 */
class Solution03 {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        val len1 = g.size
        val len2 = s.size
        var child = 0
        var cookie = 0
        g.sort()
        s.sort()
        while (child < len1 && cookie < len2) {
            if (g[child] <= s[cookie]) {
                ++child
            }
            ++cookie
        }
        return child
    }
}