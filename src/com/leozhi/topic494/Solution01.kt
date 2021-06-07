package com.leozhi.topic494

/**
 * @author leozhi
 * 回溯
 * 通过
 * 808ms
 */
class Solution01 {
    var res = 0
    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        backtrace(0, 0, nums, target)
        return res
    }

    private fun backtrace(index: Int, trace: Int, nums: IntArray, target: Int) {
        if (index == nums.size) {
            if (trace == target) ++res
            return
        }
        backtrace(index + 1, trace + nums[index], nums, target)
        backtrace(index + 1, trace - nums[index], nums, target)
    }
}