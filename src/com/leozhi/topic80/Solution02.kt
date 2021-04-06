package com.leozhi.topic80

/**
 * @author leozhi
 * 双指针
 * 官方题解
 * 通过
 * 268ms
 */
class Solution02 {
    fun removeDuplicates(nums: IntArray): Int {
        val len = nums.size
        if (len <= 2) {
            return len
        }
        var slow = 2
        var fast = 2
        while (fast < len) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow++] = nums[fast]
            }
            ++fast
        }
        return slow
    }
}