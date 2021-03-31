package com.leozhi.topic90

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

/**
 * @author leozhi
 * 回溯算法
 * 通过
 * 232ms
 */
class Solution01 {
    private val res = HashSet<ArrayList<Int>>()
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        val track = ArrayList<Int>()
        Arrays.sort(nums)
        backtrack(track, nums, 0)
        return res.toList()
    }

    fun backtrack(track: ArrayList<Int>, nums: IntArray, index: Int) {
        res.add(ArrayList(track))
        if (index == nums.size) {
            return
        }
        for (i in index until nums.size) {
            track.add(nums[i])
            backtrack(track, nums, i + 1)
            track.removeAt(track.size - 1)
        }
    }
}