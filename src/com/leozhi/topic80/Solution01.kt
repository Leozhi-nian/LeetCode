package com.leozhi.topic80

/**
 * @author leozhi
 * 双指针
 * 通过
 * 224ms
 */
class Solution01 {
    fun removeDuplicates(nums: IntArray): Int {
        val len = nums.size
        if (len <= 2) {
            return len
        }
        var left = 1
        var right = 2
        while (right < len) {
            val case1 = nums[left] == nums[left - 1] && nums[left] != nums[right]
            val case2 = nums[left] != nums[left - 1] && nums[left] == nums[right]
            val case3 = nums[left] != nums[left - 1] && nums[left] != nums[right]
            if (case1 || case2 || case3) {
                nums[++left] = nums[right]
            }
            ++right
        }
        return left + 1
    }
}