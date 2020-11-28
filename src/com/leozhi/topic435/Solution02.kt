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
        intervals.sortWith(Comparator { o1, o2 ->  o1[1] - o2[1]})
        var pre = intervals[0]
        for (i in 1 until len) {
            if (intervals[i][0] < pre[1]) {
                res++
            } else {
                pre = intervals[i]
            }
        }
        return res
    }
}