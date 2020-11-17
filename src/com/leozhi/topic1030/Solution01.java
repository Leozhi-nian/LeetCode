package com.leozhi.topic1030;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leozhi
 * 数组排序
 * 通过
 * 17ms
 */
public class Solution01 {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R * C][2];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                res[i * C + j][0] = i;
                res[i * C + j][1] = j;
            }
        }
        Arrays.sort(res, Comparator.comparingInt(o -> (Math.abs(o[0] - r0) + Math.abs(o[1] - c0))));
        return res;
    }
}
