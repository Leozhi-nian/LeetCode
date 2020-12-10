package com.leozhi.topic22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 回溯算法
 * 通过
 * 2ms
 */
public class Solution01 {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        List<Character> trace = new ArrayList<>();
        backtrace(trace, 0, 0, n);
        return res;
    }

    /**
     * @param trace 路径
     * @param count1 已使用的 '(' 的数量
     * @param count2 已使用的 '(' 的数量
     * @param n 有效括号的对数
     */
    private void backtrace(List<Character> trace, int count1, int count2, int n) {
        // 满足结束条件
        if (count1 == n && count2 == n) {
            // 将路径加入返回结果
            res.add(listToString(trace));
            return;
        }
        // 排除不符合的情况
        // count1 < count2 用来判断括号是否有效
        if (count1 > n || count2 > n || count1 < count2) {
            return;
        }
        // 选择 '('
        trace.add('(');
        backtrace(trace, count1 + 1, count2, n);
        // 移除选择
        trace.remove(trace.size() - 1);
        // 选择 ')'
        trace.add(')');
        backtrace(trace, count1, count2 + 1, n);
        // 移除选择
        trace.remove(trace.size() - 1);
    }

    private String listToString(List<Character> list) {
        Object[] chars = list.toArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (Object aChar : chars) {
            stringBuilder.append(aChar);
        }
        return stringBuilder.toString();
    }
}
