package com.leozhi.topic5

/**
 * @author leozhi
 * 中心扩展 + 双指针
 * 通过
 * 304ms
 */
class Solution02 {
    fun longestPalindrome(s: String): String {
        var res = ""
        for (i in s.indices) {
            val s1 = palindrome(s, i, i)
            val s2 = palindrome(s, i, i + 1)
            res = if (res.length > s1.length) res else s1
            res = if (res.length > s2.length) res else s2
        }
        return res
    }

    private fun palindrome(s: String, left: Int, right: Int): String {
        var l = left
        var r = right
        while (l >= 0 && r < s.length && s[l] == s[r]) {
            --l
            ++r
        }
        return s.substring(l + 1, r)
    }
}