package com.leozhi.topic56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leozhi
 * 排序
 * 通过
 * 3ms
 */
public class Solution01 {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        if (len <= 1) {
            return intervals;
        }
        int[] starts = new int[len], ends = new int[len];
        // 将区间的开头和结尾分别存入数组中
        for (int i = 0; i < len; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        List<int[]> resList = new ArrayList<>();
        for (int i = 0, j = 0; i < len; i++) {

            if ((i == (len - 1)) || (starts[i + 1] > ends[i])) {
                resList.add(new int[]{starts[j], ends[i]});
                j = i + 1;
            }
        }
        int[][] res = new int[resList.size()][2];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }
}
