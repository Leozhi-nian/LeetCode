package com.leozhi.topic480

import java.util.*

/**
 * @author leozhi
 * 双优先队列 + 延时删除
 * 官方题解
 * 通过
 * 476ms
 */
class Solution01 {
    fun medianSlidingWindow(nums: IntArray, k: Int): DoubleArray {
        val dualHeap = DualHeap(k)
        for (i in 0 until k) {
            dualHeap.insert(nums[i])
        }
        val ans = DoubleArray(nums.size - k + 1)
        ans[0] = dualHeap.getMedian()
        for (i in k until nums.size) {
            dualHeap.insert(nums[i])
            dualHeap.erase(nums[i - k])
            ans[i - k + 1] = dualHeap.getMedian()
        }
        return ans
    }
}

class DualHeap(var k: Int) {
    // 大根堆，维护较小的一半元素
    private val small: PriorityQueue<Int> = PriorityQueue { o1, o2 -> o2.compareTo(o1) }

    // 小根堆，维护较大的一半元素
    private val large: PriorityQueue<Int> = PriorityQueue { o1, o2 -> o1.compareTo(o2) }
    // 哈希表，记录延迟删除的元素，key 为元素，value 为需要删除的次数
    private val delayed = mutableMapOf<Int, Int>()

    // small 和 large 当前包含的元素个数，需要扣除被延迟删除的元素
    private var smallSize = 0
    private var largeSize = 0

    fun getMedian(): Double {
        return if (k.and(1) == 1) small.peek().toDouble() else (small.peek().toDouble() + large.peek()) / 2
    }
    fun insert(num: Int) {
        if (small.isEmpty() || num <= small.peek()) {
            small.offer(num)
            ++smallSize
        } else {
            large.offer(num)
            ++largeSize
        }
        makeBalance()
    }

    fun erase(num: Int) {
        delayed[num] = delayed.getOrDefault(num, 0) + 1
        if (num <= small.peek()) {
            --smallSize
            if (num == small.peek()) {
                prune(small)
            }
        } else {
            --largeSize
            if (num == large.peek()) {
                prune(large)
            }
        }
        makeBalance()
    }

    /**
     * 调整 small 和 large 中的元素个数，使得二者的元素个数满足要求
     */
    private fun makeBalance() {
        if (smallSize > largeSize + 1) {
            // small 比 large 元素多2个
            large.offer(small.poll())
            --smallSize
            ++largeSize
            // small 堆顶元素被移除，需要进行 prune
            prune(small)
        } else if (smallSize < largeSize) {
            // large 比 small 元素多1个
            small.offer(large.poll())
            ++smallSize
            --largeSize
            // large 堆顶元素被移除，需要进行 prune
            prune(large)
        }
    }

    /**
     * 不断地弹出 heap 的堆顶元素，并且更新哈希表
     */
    private fun prune(heap: PriorityQueue<Int>) {
        while (!heap.isEmpty()) {
            val num = heap.peek()
            if (delayed.containsKey(num)) {
                delayed[num] = delayed[num]!! - 1
                if (delayed[num] == 0) {
                    delayed.remove(num)
                }
                heap.poll()
            } else {
                break
            }
        }
    }
}