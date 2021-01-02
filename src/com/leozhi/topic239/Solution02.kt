package com.leozhi.topic239

import java.util.LinkedList
import kotlin.collections.ArrayList

/**
 * @author leozhi
 * 单调队列
 * 通过
 * 1028ms
 */
class Solution02 {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val window = MonotonicQueue02()
        val res: MutableList<Int> = ArrayList()
        for (i in 0 until nums.size) {
            if (i < k - 1) {
                window.push(nums[i])
            } else {
                window.push(nums[i])
                res.add(window.max())
                window.pop(nums[i - k + 1])
            }
        }
        val arr = IntArray(res.size)
        for (i in 0 until res.size) {
            arr[i] = res.get(i)
        }
        return arr
    }
}

class MonotonicQueue02 {
    val queue: LinkedList<Int> = LinkedList()
    fun push(n: Int) {
        while (!queue.isEmpty() && queue.last < n) {
            queue.pollLast()
        }
        queue.addLast(n)
    }

    fun max(): Int {
        return queue.first
    }

    fun pop(n: Int) {
        if (n == queue.first) {
            queue.pollFirst()
        }
    }
}