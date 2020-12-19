package com.leozhi.topic48;

/**
 * @author leozhi
 * 原地旋转
 * 通过
 * 0ms
 */
public class Solution01 {
    public void rotate(int[][] matrix) {
        int n = matrix.length, temp, layer = 1, i = 0;
        while (layer <= n / 2) {
            for (int j = layer - 1; j < n - layer; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
            i = ++layer - 1;
        }
    }
}
