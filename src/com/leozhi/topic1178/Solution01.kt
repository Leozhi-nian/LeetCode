package com.leozhi.topic1178

/**
 * @author leozhi
 * 暴力
 * 未通过
 * 超出时间限制
 */
class Solution01 {
    fun findNumOfValidWords(words: Array<String>, puzzles: Array<String>): List<Int> {
        val res = ArrayList<Int>(puzzles.size)
        val table = Array(26) {
            HashMap<String, Int>()
        }
        for (word in words) {
            for (c in word.toCharArray().distinct()) {
                val index = c - 'a'
                table[index][word] = table[index].getOrDefault(word, 0) + 1
            }
        }
        for ((index, puzzle) in puzzles.withIndex()) {
            res.add(0)
            val map = table[puzzle[0] - 'a']
            map.forEach { (key, value) ->
                if (key compare puzzle) {
                    res[index] += value
                }
            }
        }
        return res
    }

    private infix fun String.compare(puzzle: String): Boolean {
        if (!this.contains(puzzle[0])) {
            return false
        }
        val set = HashSet<Char>()
        for (c in this) {
            if (set.add(c)) {
                if (!puzzle.contains(c)) {
                    return false
                }
            }
        }
        return true
    }
}