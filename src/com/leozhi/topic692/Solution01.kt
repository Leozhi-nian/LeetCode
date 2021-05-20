package com.leozhi.topic692

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 268ms
 */
class Solution01 {
    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        var map = HashMap<String, Int>()
        for (word in words) {
            map[word] = map.getOrDefault(word, 0) + 1
        }
        map = map.entries.sortedWith(compareBy({ -it.value }, { it.key })).associateBy({ it.key }, { it.value }) as HashMap
        val res = ArrayList<String>()
        map.entries.forEach {
            if (res.size < k) {
                res.add(it.key)
            }
        }
        return res
    }
}

fun main() {
    val solution = Solution01()
    solution.topKFrequent(arrayOf("i", "love", "leetcode", "i", "love", "coding"), 2)
}