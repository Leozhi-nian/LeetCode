package com.leozhi.topic17;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 回溯
 * 通过
 * 1ms
 */
@SuppressWarnings("SpellCheckingInspection")
public class Solution01 {
    List<String> res;
    List<String> options;
    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        options = new ArrayList<>();
        // 当输入为 "" 时直接返回
        if (digits.length() == 0) {
            return res;
        }
        // 将每个按键代表的字符串放入集合中
        for (int i = 0; i < digits.length(); i++) {
            options.add(getString(digits.charAt(i)));
        }
        List<Character> trace = new ArrayList<>();
        // 从索引为 0 的按键开始
        backtrace(trace, digits.length(), 0);
        return res;
    }

    /**
     * @param trace 路径
     * @param len 按下的按键数
     * @param index 当前按键的索引
     */
    private void backtrace(List<Character> trace, int len, int index) {
        // 当路径长度等于按下的按键数时，满足结束条件，将路径添加至返回结果中
        if (trace.size() == len) {
            res.add(listToString(trace));
            return;
        }
        // 当前按键代表的字符串
        String option = options.get(index);
        // 按下该按键可选择的字符
        for (int j = 0; j < option.length(); j++) {
            trace.add(option.charAt(j));
            // 按下下一个按键
            backtrace(trace, len, index + 1);
            // 移除当前选择
            trace.remove(trace.size() - 1);
        }
    }

    /**
     * 将字符集合转为字符串
     */
    private String listToString(List<Character> list) {
        Object[] chars = list.toArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (Object aChar : chars) {
            stringBuilder.append(aChar);
        }
        return stringBuilder.toString();
    }

    /**
     * 获取对应数字按键所代表的字符串
     */
    private String getString(char i) {
        switch (i) {
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
            default:
        }
        return null;
    }
}
