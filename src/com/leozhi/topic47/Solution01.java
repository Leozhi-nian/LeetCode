package com.leozhi.topic47;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leozhi
 * 回溯
 * 通过
 * 4ms
 */
public class Solution01 {
    List<List<Integer>> res;
    Map<Integer, Integer> count;
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
        count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        List<Integer> trace = new ArrayList<>();
        backtrace(trace, nums);
        return res;
    }

    private void backtrace(List<Integer> trace, int[] nums) {
        // 满足结束条件
        if (trace.size() == nums.length) {
            res.add(new ArrayList<>(trace));
            return;
        }
        // 做选择
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int num = entry.getKey();
            if (count.get(num) == 0) {
                continue;
            }
            trace.add(num);
            count.put(num, count.get(num) - 1);
            backtrace(trace, nums);
            trace.remove(trace.size() - 1);
            count.put(num, count.get(num) + 1);
        }
    }
}
