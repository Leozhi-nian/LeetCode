package com.leozhi.topic46;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 回溯
 * 通过
 * 3ms
 */
public class Solution01 {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        // 记录走过的路径
        ArrayList<Integer> track = new ArrayList<>();
        backtrack(track, nums);
        return res;
    }

    private void backtrack(ArrayList<Integer> track, int[] nums) {
        // 触发结束条件： nums 中的元素全都在 track 中
        if (track.size() == nums.length) {
            res.add(new ArrayList<>(track));
            return;
        }
        for (int num : nums) {
            // 排除不合法的选择
            if (track.contains(num)) {
                continue;
            }
            // 做出选择
            track.add(num);
            // 进入下一层决策树
            backtrack(track, nums);
            // 取消选择
            track.remove(track.size() - 1);
        }
    }
}
