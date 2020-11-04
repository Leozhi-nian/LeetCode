package com.leozhi.topic57;

import java.util.Arrays;

/**
 * @author leozhi
 */
public class Solution01 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            int[][] res = new int[1][2];
            res[0] = newInterval;
            return res;
        }
        int max = Math.max(intervals[intervals.length - 1][1], newInterval[1]);
        int min = Math.min(intervals[0][0], newInterval[0]);
        int len = max - min + 1;
        int[][] res = new int[intervals.length + 1][2];
        int count = 0;
        int[] array = new int[len];
        Arrays.fill(array, min - 1);
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j < intervals[i][1]; j++) {
                array[j - min] = 1;
            }
        }
        for (int i = newInterval[0]; i < newInterval[1]; i++) {
            array[i - min] = 1;
        }
        print(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min - 1) {
                continue;
            }
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == min - 1) {
                    res[count++] = new int[]{i + min, j + min};
                    i = j;
                    break;
                }
            }
        }
        return Arrays.copyOfRange(res, 0, count);
    }

    private void print(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
