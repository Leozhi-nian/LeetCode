package com.leozhi.topic523

/**
 * @author leozhi
 * 前缀和 + 哈希表
 * 通过
 * 648ms
 */
class Solution02 {
    fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        val size = nums.size
        if (size < 2) return false
        val map = HashMap<Int, Int>()
        map[0] = -1
        var remainder = 0
        for (i in 0 until size) {
            remainder = (remainder + nums[i]) % k
            if (map.containsKey(remainder)) {
                val prevIndex = map[remainder]!!
                if (i - prevIndex >= 2) return true
            } else {
                map[remainder] = i
            }
        }
        return false
    }
}