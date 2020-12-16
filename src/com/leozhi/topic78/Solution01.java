package com.leozhi.topic78;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leozhi
 * 回溯算法
 * 通过
 * 1ms
 */
public class Solution01 {
    private List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(track, 0, nums);
        return res;
    }

    private void backtrack(LinkedList<Integer> track, int start, int[] nums) {
        // 满足结束条件，本题所有路径均满足条件
        res.add(new ArrayList<>(track));

        // 做选择
        for (int i = start; i < nums.length; i++) {
            track.add(nums[i]);
            backtrack(track, i + 1, nums);
            track.removeLast();
        }
    }
}
