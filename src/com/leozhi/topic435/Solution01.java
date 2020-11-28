package com.leozhi.topic435;

import java.util.Arrays;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 4ms
 */
public class Solution01 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0, len = intervals.length;
        if (len <= 1) {
            return 0;
        }
        // 先将所有区间按照终点升序排列
        Arrays.sort(intervals, (o1, o2) -> o1[1] - o2[1]);
        // Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        // 初始化保留的前一区间为第一个区间
        int[] pre = intervals[0];
        for (int i = 1; i < len; i++) {
            // 如果当前区间的起点小于保留区间中的前一区间的终点，则应将该区间删除，否则将保留区间的前一区间更新为当前区间
            if (intervals[i][0] < pre[1]) {
                res++;
            } else {
                pre = intervals[i];
            }
        }
        return res;
    }
}
