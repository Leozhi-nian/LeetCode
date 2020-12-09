package com.leozhi.topic47

/**
 * @author leozhi
 * 回溯
 * 通过
 * 268ms
 */
class Solution02 {
    val res = ArrayList<ArrayList<Int>>()
    val count = HashMap<Int, Int>()
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        for (num in nums) {
            count[num] = count.getOrDefault(num, 0) + 1
        }
        val trace = ArrayList<Int>()
        backtrace(trace, nums)
        return res
    }

    private fun backtrace(trace: ArrayList<Int>, nums: IntArray) {
        if (trace.size == nums.size) {
            res.add(ArrayList(trace))
            return
        }
        for (entry in count.entries) {
            val num = entry.key
            if (count[num] == 0) {
                continue
            }
            trace.add(num)
            count[num]?.minus(1)?.let { count.put(num, it) }
            backtrace(trace, nums)
            trace.removeAt(trace.size - 1)
            count[num]?.plus(1)?.let { count.put(num, it) }
        }
    }
}