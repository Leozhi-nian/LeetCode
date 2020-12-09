package com.leozhi.topic62;

import java.util.Arrays;

/**
 * @author leozhi
 * 动态规划
 * 通过
 * 0ms
 */
public class Solution01 {
    public int uniquePaths(int m, int n) {
        int[][] position = new int[n][m];
        int[] row = new int[m];
        Arrays.fill(row, 1);
        position[0] = row;
        for (int i = 0; i < n; i++) {
            position[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                position[i][j] = position[i - 1][j] + position[i][j - 1];
            }
        }
        return position[n - 1][m - 1];
    }
}
