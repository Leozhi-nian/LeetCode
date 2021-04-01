package com.leozhi.topic421

import createIntArray

/**
 * @author leozhi
 * 421. 数组中两个数的最大异或值
 * 给定一个非空数组，数组中元素为 a0, a1, a2, … , an-1，其中 0 ≤ ai < 231  。
 * 找到 ai 和aj  最大的异或 (XOR) 运算结果，其中0 ≤ i,    j < n  。
 * 你能在O(n)的时间解决这个问题吗？
 */
fun main() {
    createIntArray(20, 0, 500).let(::println)
    val solution = Solution02()
    solution.findMaximumXOR(intArrayOf(457,216,7,107,459,468,291,96,72,74,450,62,67,208,55,267,129,107,158,123))
}