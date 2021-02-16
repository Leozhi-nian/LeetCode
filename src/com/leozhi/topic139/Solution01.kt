package com.leozhi.topic139

/**
 * @author leozhi
 * 记忆化回溯
 * 通过
 * 228ms
 */
class Solution01 {
    private var memo = booleanArrayOf()
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        this.memo = BooleanArray(s.length)
        val set: Set<String> = HashSet(wordDict)
        return backtrack(s, 0, set)
    }

    private fun backtrack(s: String, start: Int, set: Set<String>): Boolean {
        if (s.isEmpty()) {
            return true
        }
        if (memo[start]) {
            return false
        }
        for (i in s.indices) {
            if (set.contains(s.substring(0, i + 1))) {
                if (backtrack(s.substring(i + 1), start + i + 1, set)) return true
            }
        }
        memo[start] = true
        return false
    }
}

fun main() {
    Solution01().wordBreak("leetcode", listOf("leet", "code")).let(::println)
}