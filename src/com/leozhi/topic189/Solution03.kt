package com.leozhi.topic189

/**
 * @author leozhi
 * 数组拷贝
 * 通过
 * 320ms
 */
class Solution03 {
    fun rotate(nums: IntArray, k: Int) {
        val len = nums.size
        for (i in 0 until k) {
            val temp = nums[len - 1]
            System.arraycopy(nums, 0, nums, 1, len - 1)
            nums[0] = temp
        }
    }
}