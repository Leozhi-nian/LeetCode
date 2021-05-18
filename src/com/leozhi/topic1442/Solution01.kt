package com.leozhi.topic1442

import com.leozhi.testcase.array.convertToString
import com.leozhi.testcase.array.createIntArray

/**
 * @author leozhi
 * 前缀和
 * 通过
 * 208ms
 */
class Solution01 {
    fun countTriplets(arr: IntArray): Int {
        val size = arr.size
        val prefixNum = IntArray(size)
        prefixNum[0] = arr[0]
        for (i in 1 until size) {
            prefixNum[i] = prefixNum[i - 1].xor(arr[i])
        }
        var res = 0
        for (i in 0 until size) {
            for (j in i + 1 until size) {
                for (k in j until size) {
                    val a = if (i == 0) prefixNum[j - 1] else prefixNum[j - 1].xor(prefixNum[i - 1])
                    val b = prefixNum[k].xor(prefixNum[j - 1])
                    if (a == b) ++res
                }
            }
        }
        return res
    }
}

fun main() {
    val solution = Solution01()
    solution.countTriplets(intArrayOf(1,1,1,1,1))
    createIntArray(300, 100000000, 1).convertToString().let(::println)
}