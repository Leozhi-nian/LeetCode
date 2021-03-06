package com.leozhi.topic496

import java.util.*
import kotlin.collections.HashMap

/**
 * @author leozhi
 * 单调栈
 * 通过
 * 216ms
 */
class Solution03 {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val res = IntArray(nums1.size)
        val stack = Stack<Int>()
        // key 为 nums2 中的元素，value 为各元素下一个更大的数
        val map = HashMap<Int, Int>()
        for (num in nums2) {
            while (!stack.empty() && num > stack.peek()) {
                map[stack.pop()] = num
            }
            stack.push(num)
        }
        // 此时栈中剩余的元素其后没有更大的数
        while (!stack.empty()) {
            map[stack.pop()] = -1
        }
        for (i in nums1.indices) {
            res[i] = map[nums1[i]]!!
        }
        return res
    }
}