package com.leozhi.topic46

import java.util.ArrayList

/**
 * @author leozhi
 * 回溯
 * 通过
 * 232ms
 */
class Solution02 {
    var res: MutableList<List<Int>>? = null
    fun permute(nums: IntArray): List<List<Int>> {
        res = ArrayList()
        // 记录走过的路径
        val track = ArrayList<Int>()
        backtrack(track, nums)
        return res as ArrayList<List<Int>>
    }

    private fun backtrack(track: ArrayList<Int>, nums: IntArray) {
        // 触发结束条件： nums 中的元素全都在 track 中
        if (track.size == nums.size) {
            res!!.add(ArrayList(track))
            return
        }
        for (num in nums) {
            // 排除不合法的选择
            if (track.contains(num)) {
                continue
            }
            // 做出选择
            track.add(num)
            // 进入下一层决策树
            backtrack(track, nums)
            // 取消选择
            track.removeAt(track.size - 1)
        }
    }
}