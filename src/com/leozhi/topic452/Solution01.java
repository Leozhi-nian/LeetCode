package com.leozhi.topic452;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leozhi
 * 排序 + 贪心算法
 * 官方题解
 * 通过
 * 19ms
 */
class Solution01 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(point -> point[1]));
        int pos = points[0][1];
        int ans = 1;
        for (int[] balloon: points) {
            if (balloon[0] > pos) {
                pos = balloon[1];
                ++ans;
            }
        }
        return ans;
    }
}