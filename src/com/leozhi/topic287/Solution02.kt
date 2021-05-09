package com.leozhi.topic287

/**
 * @author leozhi
 * 二分查找
 * 官方题解
 * 通过
 * 548ms
 */
class Solution02 {
    fun findDuplicate(nums: IntArray): Int {
        val len = nums.size
        var left = 1
        var right = len - 1
        var res = -1
        while (left <= right) {
            val mid = left + (right - left) / 2
            var cnt = 0
            for (num in nums) {
                if (num <= mid) {
                    ++cnt
                }
            }
            if (cnt <= mid) {
                left = mid + 1
            } else {
                right = mid - 1
                res = mid
            }
        }
        return res
    }
}

fun main() {
    val array = intArrayOf(2, 2, 3, 4, 5, 6)
    val solution = Solution02()
    solution.findDuplicate(array)
}