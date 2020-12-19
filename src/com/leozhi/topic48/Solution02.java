package com.leozhi.topic48;

/**
 * @author leozhi
 * 翻转代替旋转
 * 通过
 * 0ms
 */
public class Solution02 {
    public void rotate(int[][] matrix) {
        int len = matrix.length, temp;
        // 水平翻转
        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < len; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[len - i - 1][j];
                matrix[len - i - 1][j] = temp;
            }
        }
        // 正对角线翻转
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
