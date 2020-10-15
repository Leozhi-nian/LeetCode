package com.leozhi.topic867;

/**
 * @author leozhi
 * 通过
 */
public class Solution01 {
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = A[j][i];
            }
        }
        return result;
    }
}
