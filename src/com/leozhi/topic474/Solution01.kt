package com.leozhi.topic474

import com.leozhi.testcase.array.convertToString
import com.leozhi.testcase.array.createString
import kotlin.random.Random

/**
 * @author leozhi
 * 回溯算法
 * 超出时间限制
 */
class Solution01 {
    var zeroCount = 0
    var oneCount = 0
    var size = 0
    var res = 0
    fun findMaxForm(strs: Array<String>, m: Int, n: Int): Int {
        val size = strs.size
        val counts = Array(size) { Pair(0, 0) }
        for ((index, str) in strs.withIndex()) {
            counts[index] = str.length.let {
                val zeroLen = str.replace("1", "").length
                Pair(zeroLen, it - zeroLen)
            }
        }
        backtrace(counts, 0, m, n)
        return res
    }

    private fun backtrace(counts: Array<Pair<Int, Int>>, index: Int, m: Int, n: Int) {
        if (zeroCount > m || oneCount > n || index == counts.size) {
            if (zeroCount <= m && oneCount <= n) res = if (res > size) res else size
            return
        }
        for (i in index until counts.size) {
            if (zeroCount <= m && oneCount <= n) res = if (res > size) res else size
            zeroCount += counts[i].first
            oneCount += counts[i].second
            size += 1
            backtrace(counts, i + 1, m, n)
            zeroCount -= counts[i].first
            oneCount -= counts[i].second
            size -= 1
        }
    }
}

fun main() {
    val solution01 = Solution03()
    solution01.findMaxForm(arrayOf("10","0","1"), 1, 1)
    val array = Array(600) { "" }
    for (i in array.indices) {
        array[i] = createString(Random.nextInt(1, 100), '0'..'1')
    }
    array.convertToString().let(::println)
}