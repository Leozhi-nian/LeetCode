package com.leozhi.topic10

import java.util.regex.Pattern

/**
 * @author leozhi
 * 正则表达式
 * 通过
 * 312ms
 */
class Solution01 {
    fun isMatch(s: String, p: String): Boolean {
        return Pattern.matches(p, s)
    }
}