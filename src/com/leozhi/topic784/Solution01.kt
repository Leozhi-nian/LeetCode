package com.leozhi.topic784

import com.leozhi.testcase.array.createString

/**
 * @author leozhi
 * 回溯算法
 * 通过
 * 368ms
 */
class Solution01 {
    fun letterCasePermutation(s: String): List<String> {
        val res = ArrayList<String>()
        val chars = s.toCharArray()
        backtrack(chars, 0, res)
        return res
    }

    fun backtrack(track: CharArray, index: Int, list: ArrayList<String>) {
        val s = String(track)
        if (!list.contains(s)) {
            list.add(s)
        }
        if (index == s.length) {
            return
        }
        for (i in index until s.length) {
            if (s[i] >= 'A') {
                track[i] = track[i].code.xor(32).toChar()
            } else {
                continue
            }
            backtrack(track, i + 1, list)
            if (s[i] >= 'A') {
                track[i] = track[i].code.xor(32).toChar()
            }
        }
    }
}

fun main() {
    for (i in 0..100) {
        println("\"${createString(12, '0'..'9', 'a'..'z', 'A'..'Z')}\"")
    }

    val solution = Solution01()
    solution.letterCasePermutation("c")
}