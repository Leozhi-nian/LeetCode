package com.leozhi.topic1695

import com.leozhi.testcase.array.convertToString
import com.leozhi.testcase.array.createIntArray

/**
 * @author leozhi
 * 滑动窗口
 * 通过
 * 716ms
 */
class Solution01 {
    fun maximumUniqueSubarray(nums: IntArray): Int {
        val window = HashSet<Int>()
        val len = nums.size
        var left = 0
        var right = 0
        var sum = 0
        var res = 0
        while (right < len) {
            val num = nums[right++]
            // 进行窗口内数据更新
            if (window.add(num)) sum += num
            // 判断左侧窗口是否收缩
            while (right < len && left < len && window.contains(nums[right])) {
                window.remove(nums[left])
                res = if (res > sum) res else sum
                sum -= nums[left++]
            }
            res = if (res > sum) res else sum
        }
        return res
    }
}

fun main() {
    val solution = Solution01()
    solution.maximumUniqueSubarray(intArrayOf(4,2,4,5,6))

    createIntArray(100000, 10000, 1).convertToString().let(::println)
}