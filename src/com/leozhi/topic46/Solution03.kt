package com.leozhi.topic46

/**
 * @author leozhi
 * 回溯
 * 通过
 * 228ms
 */
class Solution03 {
    val res = ArrayList<ArrayList<Int>>()
    fun permute(nums: IntArray): List<List<Int>> {
        val track = ArrayList<Int>()
        backtrace(track, nums)
        return res
    }

    private fun backtrace(track: ArrayList<Int>, nums: IntArray) {
        if (track.size == nums.size) {
            res.add(ArrayList(track))
            return
        }
        for (num in nums) {
            if (track.contains(num)) {
                continue
            }
            track.add(num)
            backtrace(track, nums)
            track.remove(num)
        }
    }
}