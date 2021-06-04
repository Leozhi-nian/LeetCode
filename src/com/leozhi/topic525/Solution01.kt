package com.leozhi.topic525

/**
 * @author leozhi
 * 前缀和 + 哈希表
 * 通过
 * 528ms
 */
class Solution01 {
    fun findMaxLength(nums: IntArray): Int {
        val size = nums.size
        if (size < 2) return 0
        val map = HashMap<Int, Int>()
        var cur = 0
        var ans = 0
        map[0] = -1
        for (i in 0 until size) {
            if (nums[i] == 1) ++cur else --cur
            if (map.containsKey(cur)) {
                ans = if (ans > i - map[cur]!!) ans else i - map[cur]!!
            } else {
                map[cur] = i
            }
        }
        return ans
    }
}