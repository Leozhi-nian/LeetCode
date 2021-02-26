package com.leozhi.topic1178

/**
 * @author leozhi
 * 二进制状态压缩
 * 通过
 * 644ms
 */
class Solution02 {
    fun findNumOfValidWords(words: Array<String>, puzzles: Array<String>): List<Int> {
        val frequency = HashMap<Int, Int>()

        for (word in words) {
            var mask = 0
            for (c in word) {
                mask = mask.or(1.shl(c - 'a'))
            }
            if (Integer.bitCount(mask) <= 7) {
                frequency[mask] = frequency.getOrDefault(mask, 0) + 1
            }
        }

        val res = ArrayList<Int>()
        for (puzzle in puzzles) {
            var total = 0
            var mask = 0
            for (i in 1 until 7) {
                mask = mask.or(1.shl(puzzle[i] - 'a'))
            }
            var subset = mask
            do {
                val s = subset.or(1.shl(puzzle[0] - 'a'))
                if (frequency.containsKey(s)) {
                    total += frequency[s]!!
                }
                subset = (subset - 1).and(mask)
            } while (subset != mask)

            res.add(total)
        }
        return res
    }
}