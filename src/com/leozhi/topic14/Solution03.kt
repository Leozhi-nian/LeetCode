package com.leozhi.topic14

/**
 * @author leozhi
 * 暴力
 * 通过
 * 196ms
 */
class Solution03 {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }
        val stringBuilder: StringBuilder = StringBuilder()
        for (i in strs[0].indices) {
            val ch = strs[0][i]
            for (j in 1 until strs.size) {
                if (i > strs[j].length - 1 || strs[j][i] != ch) {
                    return stringBuilder.toString()
                }
            }
            stringBuilder.append(ch)
        }
        return stringBuilder.toString()
    }
}