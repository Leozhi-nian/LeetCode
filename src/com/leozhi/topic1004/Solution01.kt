package com.leozhi.topic1004

import kotlin.math.max

/**
 * @author leozhi
 * 滑动窗口
 * 通过
 * 1004ms
 */
class Solution01 {
    fun longestOnes(A: IntArray, K: Int): Int {
        var left = 0
        var right = 0
        var k = K
        // 记录结果
        var res = 0

        while (right < A.size) {
            // inNum 是要移入窗口的数字
            val inNum = A[right]
            // 右移窗口
            ++right
            // 进行窗口内数据的一系列更新
            if (inNum == 0) {
                --k
            }

            // region debug
            println("window: [$left, $right]\n")
            // endregion

            // 判断左侧窗口是否要收缩
            while (k < 0) {
                // outNum 是要移出窗口的数字
                val outNum = A[left]
                // 左移窗口
                ++left
                // 进行窗口内数据的一系列更新
                if (outNum == 0) {
                    ++k
                }
            }
            // 更新结果
            res = max(res, right - left)
        }
        return res
    }
}

fun main() {
    val solution = Solution01()
    solution.longestOnes(intArrayOf(1,1,1,0,0,0,1,1,1,1,0), 2)
}