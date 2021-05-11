package com.leozhi.topic1734

/**
 * @author leozhi
 * 位运算
 * 通过
 * 744ms
 */
class Solution01 {
    fun decode(encoded: IntArray): IntArray {
        val len = encoded.size + 1
        val res = IntArray(len)
        var xorSum = 0
        var xorOdd = 0
        for (i in 1..len) {
            if (i < len && i.and(1) == 1) {
                xorOdd = xorOdd.xor(encoded[i])
            }
            xorSum = xorSum.xor(i)
        }
        res[0] = xorOdd.xor(xorSum)
        for (i in 1 until len) {
            res[i] = res[i - 1].xor(encoded[i - 1])
        }
        return res
    }
}

fun main() {
    val solution = Solution01()
    solution.decode(intArrayOf(7,5,6,11,14,15,11,6))
}