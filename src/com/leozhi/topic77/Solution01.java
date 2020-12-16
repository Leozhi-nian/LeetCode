package com.leozhi.topic77;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leozhi
 * 回溯算法
 * 通过
 * 19ms
 */
public class Solution01 {
    private List<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(track, 1, n, k);
        return res;
    }

    private void backtrack(LinkedList<Integer> track, int start, int n, int k) {
        // 满足结束条件
        if (track.size() == k) {
            res.add(new ArrayList<>(track));
            return;
        }

        // 做选择
        for (int i = start; i <= n; i++) {
            track.add(i);
            backtrack(track, i + 1, n, k);
            track.removeLast();
        }
    }
}
