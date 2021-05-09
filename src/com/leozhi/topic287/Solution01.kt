package com.leozhi.topic287

/**
 * @author leozhi
 * 集合
 * 通过
 * 544ms
 */
class Solution01 {
    fun findDuplicate(nums: IntArray): Int {
        val set = HashSet<Int>()
        for (num in nums) {
            if (!set.add(num)) {
                return num
            }
        }
        return 0
    }
}