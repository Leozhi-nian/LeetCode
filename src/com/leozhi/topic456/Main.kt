package com.leozhi.topic456

import createIntArray

/**
 * @author leozhi
 * 456. 132 模式
 * 给你一个整数数组 nums ，数组中共有 n 个整数。132 模式的子序列 由三个整数 nums[ i ]、nums[ j ] 和 nums[ k ] 组成，并同时满足：i < j < k 和 nums[ i ] < nums[ k ] < nums[ j ] 。
 * 如果 nums 中存在 132 模式的子序列 ，返回 true ；否则，返回 false 。
 */
fun main() {
    val solution = Solution01()
    // 2148473647
    for (i in 0..50) {
        createIntArray(10000, -100000000, 1000000000).let(::println)
    }
    solution.find132pattern(intArrayOf(-1,3,2,0))
}