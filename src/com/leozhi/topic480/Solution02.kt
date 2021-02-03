package com.leozhi.topic480

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 404ms
 */
class Solution02 {
    fun medianSlidingWindow(nums: IntArray, k: Int): DoubleArray {
        val res = DoubleArray(nums.size - k + 1)
        val list = mutableListOf<Int>()

        for (i in 0 until k) {
            list.add(binarySearch(list, nums[i]), nums[i])
        }
        res[0] = getMedian(list, k)
        for (i in k until nums.size) {
            list.removeAt(binarySearch(list, nums[i - k]))
            list.add(binarySearch(list, nums[i]), nums[i])
            res[i - k + 1] = getMedian(list, k)
        }
        return res
    }

    private fun getMedian(list: MutableList<Int>, k: Int) = (list[(k - 1) / 2].toDouble() + list[k / 2].toDouble()) / 2

    private fun binarySearch(data: List<Int>, target: Int): Int {
        var left = 0
        var right = data.size - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            when {
                target > data[mid] -> right = mid - 1
                target < data[mid] -> left = mid + 1
                else -> return mid
            }
        }
        return left
    }
}