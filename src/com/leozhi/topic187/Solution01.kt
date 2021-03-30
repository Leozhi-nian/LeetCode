package com.leozhi.topic187

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 304ms
 */
class Solution01 {
    fun findRepeatedDnaSequences(s: String): List<String> {
        val L = 10
        val len = s.length
        val res = HashSet<String>()
        val sequence = HashSet<String>()
        for (i in 0 until len - L + 1) {
            val str = s.substring(i, i + L)
            if (sequence.contains(str)) {
                res.add(str)
            } else {
                sequence.add(str)
            }
        }
        return res.toList()
    }
}