package com.leozhi.topic435

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 236ms
 */
class Solution02 {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        var res = 0
        val len = intervals.size
        if (len <= 1) {
            return 0
        }
        // 将所有区间按照终点升序排列
        intervals.sortWith { o1, o2 -> o1[1] - o2[1] }
        // 初始化保留区间的最后一个区间为第一个区间
        var pre = intervals[0]
        for (i in 1 until len) {
            // 如果当前区间的起点小于保留区间中的最后一个区间的中点，则应将当前区间删除，否则将保留区间的最后一个区间更新为当前区间
            if (intervals[i][0] < pre[1]) {
                res++
            } else {
                pre = intervals[i]
            }
        }
        return res
    }
}