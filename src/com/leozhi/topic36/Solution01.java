package com.leozhi.topic36;

import java.util.HashSet;

/**
 * @author leozhi
 * 通过
 */
public class Solution01 {
    private final int N = 9;
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer>[] rows = new HashSet[N];
        HashSet<Integer>[] cols = new HashSet[N];
        HashSet<Integer>[] boxes = new HashSet[N];
        for (int i = 0; i < N; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int temp = board[i][j] - '0';
                HashSet<Integer> box = boxes[(i / 3) * 3 + j / 3];
                if (rows[i].contains(temp) || cols[j].contains(temp) || box.contains(temp)) {
                    return false;
                }
                rows[i].add(temp);
                cols[j].add(temp);
                box.add(temp);
            }
        }
        return true;
    }
}
