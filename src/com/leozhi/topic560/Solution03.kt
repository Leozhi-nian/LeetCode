package com.leozhi.topic560

/**
 * @author leozhi
 * 前缀和 + 哈希表优化
 * 通过
 * 340ms
 */
class Solution03 {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var preSum = 0
        val map = HashMap<Int, Int>()
        map[0] = 1
        var res = 0
        for (num in nums) {
            preSum += num
            if (map.containsKey(preSum - k)) {
                res += map[preSum - k]!!
            }
            map[preSum] = map.getOrDefault(preSum, 0) + 1
        }
        return res
    }
}