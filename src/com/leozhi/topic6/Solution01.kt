package com.leozhi.topic6

/**
 * @author leozhi
 * 枚举
 * 通过
 * 324ms
 */
class Solution01 {
    fun convert(s: String, numRows: Int): String {
        val res = ArrayList<ArrayList<Char>>()
        var index = 0
        for (i in 1..numRows) {
            res.add(ArrayList())
        }
        while (index < s.length) {
            for (i in 0 until numRows) {
                if (index < s.length) {
                    res[i].add(s[index++])
                }
            }
            for (i in numRows - 2 downTo 1) {
                if (index < s.length) {
                    res[i].add(s[index++])
                }
            }
        }
        return StringBuilder().apply {
            for (list in res) {
                append(list.joinToString(""))
            }
        }.toString()
    }
}