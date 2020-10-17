package com.leozhi.topic52;

/**
 * @author leozhi
 * 基于位运算的回溯
 * 通过
 * 0ms
 */
public class Solution02 {
    public int totalNQueens(int n) {
        return solve(n, 0, 0, 0, 0);
    }

    private int solve(int n, int row, int columns, int diagonals1, int diagonals2) {
        if (row == n) {
            return 1;
        } else {
            int count = 0;
            int availablePositions = ((1 << n) - 1) & (~(columns | diagonals1 | diagonals2));
            while (availablePositions != 0) {
                int position = availablePositions & (-availablePositions);
                availablePositions = availablePositions & (availablePositions - 1);
                count += solve(n, row + 1, columns | position, (diagonals1 | position) << 1, (diagonals2 | position) >> 1);
            }
            return count;
        }
    }
}
