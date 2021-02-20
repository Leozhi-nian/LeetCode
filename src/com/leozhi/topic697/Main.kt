package com.leozhi.topic697

/**
 * @author leozhi
 * 697. 数组的度
 * 给定一个非空且只包含非负数的整数数组 nums，数组的度的定义是指数组里任一元素出现频数的最大值。
 * 
 * 你的任务是在 nums 中找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
 */
fun main() {
    val solution = Solution01()
    solution.findShortestSubArray(intArrayOf(1, 2, 2, 3, 1))
}