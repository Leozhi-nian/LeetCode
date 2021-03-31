package com.leozhi.topic90

import createIntArray
import kotlin.concurrent.thread

/**
 * @author leozhi
 * 90. 子集 II
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 */
fun main() {
    val solution = Solution01()
    solution.subsetsWithDup(intArrayOf(1,2,3))

    // for (i in 0..10) {
    //     Thread.sleep(1000)
    //     createIntArray(10, -10, 10).let(::println)
    // }
}