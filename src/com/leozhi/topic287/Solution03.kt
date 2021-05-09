package com.leozhi.topic287

/**
 * @author leozhi
 * 快慢指针 弗洛伊德判圈算法
 * 官方题解
 * 通过
 * 624ms
 */
class Solution03 {
    fun findDuplicate(nums: IntArray): Int {
        var slow = 0
        var fast = 0
        do {
            slow = nums[slow]
            fast = nums[nums[fast]]
        } while (slow != fast)
        slow = 0
        while (slow != fast) {
            slow = nums[slow]
            fast = nums[fast]
        }
        return slow
    }
}