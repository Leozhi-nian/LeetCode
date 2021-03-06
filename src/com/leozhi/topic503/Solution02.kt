package com.leozhi.topic503

import java.util.*

/**
 * @author leozhi
 * 单调栈
 * 通过
 * 492ms
 */
class Solution02 {
    fun nextGreaterElements(nums: IntArray): IntArray {
        val size = nums.size
        val res = IntArray(size)
        val stack = Stack<Int>()
        for (i in 2 * size - 1 downTo 0) {
            while (!stack.empty() && stack.peek() <= nums[i % size]) {
                stack.pop()
            }
            res[i % size] = if (stack.empty()) -1 else stack.peek()
            stack.push(nums[i % size])
        }
        return res
    }
}