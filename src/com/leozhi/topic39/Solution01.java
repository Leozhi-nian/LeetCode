package com.leozhi.topic39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leozhi
 * 回溯算法
 * 通过
 * 5ms
 */
public class Solution01 {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        res = new ArrayList<>();
        List<Integer> trace = new ArrayList<>();
        backtrace(trace, candidates,  0, target);
        return res;
    }

    /**
     * @param trace 路径
     * @param options 选择
     * @param sum 路径之和
     * @param target 目标值
     */
    private void backtrace(List<Integer> trace, int[] options, int sum, int target) {
        // 满足返回条件， 路径之和等于目标值
        if (sum == target) {
            res.add(new ArrayList<>(trace));
            return;
        }
        // 做选择
        for (int option : options) {
            // 排除不符合的情况
            // 路径之和与当前选择之和如果大于目标值，则不再与当前值及其之后的值进行求和
            if (sum + option > target) {
                break;
            }
            // 当前选择如果小于路径中最后一次的选择，则说明该路径之前已经判断过，为避免重复不再计算
            if (trace.size() > 0 && option < trace.get(trace.size() - 1)) {
                continue;
            }
            // 选择当前值
            trace.add(option);
            backtrace(trace, options, sum + option, target);
            // 撤销当前选择
            trace.remove(trace.size() - 1);
        }
    }
}
