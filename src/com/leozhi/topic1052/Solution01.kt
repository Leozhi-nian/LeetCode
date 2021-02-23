package com.leozhi.topic1052

/**
 * @author leozhi
 * 滑动窗口
 * 通过
 * 264ms
 */
class Solution01 {
    fun maxSatisfied(customers: IntArray, grumpy: IntArray, X: Int): Int {
        var sum = 0
        var res = 0
        val size = customers.size
        var x = X
        // 遍历顾客数组，计算不使用秘密技巧时，感到满意的顾客数量
        for (i in 0 until size) {
            sum += customers[i] * grumpy[i].xor(1)
        }
        // 滑动窗口模板
        var left = 0
        var right = 0
        while (right < size) {
            // 向窗口内添加元素
            if (grumpy[right] == 1) {
                sum += customers[right]
            }
            ++right
            --x

            // 更新结果
            res = if (res > sum) res else sum

            // 从窗口中移除元素
            while (x == 0) {
                if (grumpy[left] == 1) {
                    sum -= customers[left]
                }
                ++left
                ++x
            }
        }
        return res
    }
}