package com.leozhi.topic51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author leozhi
 * 回溯算法
 * 通过
 * 7ms
 */
public class Solution01 {
    List<List<String>> res;
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        List<String> board = new ArrayList<>(Collections.nCopies(n, String.join("", Collections.nCopies(n, "."))));
        backtrace(board, 0, n);
        return res;
    }

    private void backtrace(List<String> board, int row, int n) {
        // 满足结束条件
        if (row == board.size()) {
            res.add(new ArrayList<>(board));
            return;
        }
        // 做选择
        for (int col = 0; col < n; col++) {
            // 排除无效情况
            if (!isValid(board, row, col)) {
                continue;
            }
            // 做出选择
            char[] chars = new char[n];
            Arrays.fill(chars, '.');
            chars[col] = 'Q';
            board.set(row, new String(chars));
            backtrace(board, row + 1, n);
            // 移除选择
            chars[col] = '.';
            board.set(row, new String(chars));
        }
    }

    private boolean isValid(List<String> board, int row, int col) {
        // 判断同列是否存在皇后
        for (int i = 0; i < row; i++) {
            if (board.get(i).charAt(col) == 'Q') {
                return false;
            }
        }
        // 判断左上方是否存在皇后
        for (int i = row - 1, j = col - 1; i >=0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        // 判断右上方是否存在皇后
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.get(row).length(); i--, j++) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        return true;
    }
}
