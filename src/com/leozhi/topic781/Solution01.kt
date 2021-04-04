package com.leozhi.topic781

import kotlin.math.ceil

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 216ms
 */
class Solution01 {
    fun numRabbits(answers: IntArray): Int {
        val counts = HashMap<Int, Int>()
        for (answer in answers) {
            counts[answer] = counts.getOrDefault(answer, 0) + 1
        }
        var res = 0
        for (count in counts.entries) {
            res += if (count.value <= count.key + 1) {
                count.key + 1
            } else {
                ((ceil(count.value / (count.key + 1).toDouble())) * (count.key + 1)).toInt()
            }
        }
        return res
    }
}