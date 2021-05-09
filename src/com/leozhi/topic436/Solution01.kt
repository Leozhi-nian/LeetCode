package com.leozhi.topic436

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 368ms
 */
class Solution01 {
    fun findRightInterval(intervals: Array<IntArray>): IntArray {
        val len = intervals.size
        val res = IntArray(len)
        val start = Array(len) { IntArray(2) }
        for (i in 0 until len) {
            start[i][0] = intervals[i][0]
            start[i][1] = i
        }
        start.sortBy { it[0] }
        for (i in 0 until len) {
            res[i] = binarySearch(start, intervals[i][1])
        }
        return res
    }

    /**
     * 二分查找寻找左边界
     * @param array 要查找的数组
     * @param target 目标值
     */
    private fun binarySearch(array: Array<IntArray>, target: Int): Int {
        val len = array.size
        var left = 0
        var right = len - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            when {
                array[mid][0] == target -> {
                    return array[mid][1]
                }
                array[mid][0] > target -> {
                    right = mid - 1
                }
                array[mid][0] < target -> {
                    left = mid + 1
                }
            }
        }
        return if (left < len && array[left][0] > target) array[left][1] else -1
    }
}