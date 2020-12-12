package com.leozhi.topic51;

import java.util.*;

/**
 * @author leozhi
 * 基于集合的回溯
 * 通过
 * 5ms
 */
public class Solution02 {
    List<List<String>> res;
    Set<Integer> columns = new HashSet<>();
    Set<Integer> diagonals1 = new HashSet<>();
    Set<Integer> diagonals2 = new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        int[] queensPosition = new int[n];
        backtrace(queensPosition, 0, n);
        return res;
    }

    private void backtrace(int[] position, int row, int n) {
        // 满足结束条件
        if (row == n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                char[] rowChars = new char[n];
                Arrays.fill(rowChars, '.');
                rowChars[position[i]] = 'Q';
                list.add(new String(rowChars));
            }
            res.add(list);
            return;
        }
        // 做选择
        for (int col = 0; col < n; col++) {
            // 排除不符合情况
            if (columns.contains(col)) {
                continue;
            }
            int diagonal1 = row - col;
            if (diagonals1.contains(diagonal1)) {
                continue;
            }
            int diagonal2 = row + col;
            if (diagonals2.contains(diagonal2)) {
                continue;
            }
            // 做出选择
            position[row] = col;
            columns.add(col);
            diagonals1.add(diagonal1);
            diagonals2.add(diagonal2);
            backtrace(position, row + 1, n);
            // 撤销选择
            columns.remove(col);
            diagonals1.remove(diagonal1);
            diagonals2.remove(diagonal2);
        }
    }
}
