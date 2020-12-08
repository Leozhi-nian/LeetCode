package com.leozhi.topic842;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 回溯 + 剪枝
 * 通过
 * 3ms
 */
public class Solution01 {
    List<Integer> res;
    public List<Integer> splitIntoFibonacci(String S) {
        res = new ArrayList<>();
        return dfs(0, S, 0, 0, 0) ? res : new ArrayList<>();
    }

    /**
     * @param index 当前指针指向数组的索引
     * @param s 字符串
     * @param prev1 前两个数字中的第一个
     * @param prev2 前两个数字中的第二个
     * @param deep 当前的数字
     */
    private boolean dfs(int index, String s, int prev1, int prev2, int deep) {
        int len = s.length();
        if (index == len) {
            return deep >= 3;
        }
        for (int i = 1; i < 11; i++) {
            // 超出长度或者以 0 开头直接 break
            if (index + i > len || (s.charAt(index) == '0' && i > 1)) {
                break;
            }
            String sub = s.substring(index, index + i);
            long numL = Long.parseLong(sub);
            // 判断是否超出范围，或者 deep 不是 0 或 1却大于他的前两个数之和
            if (numL > Integer.MAX_VALUE || (deep != 0 && deep != 1 && numL > (prev1 + prev2))) {
                break;
            }
            Integer num = (int)numL;
            // 满足条件的数，递归加回溯
            if (deep == 0 || deep == 1 || num.equals(prev1 + prev2)) {
                res.add(num);
                if (dfs(index + i, s, prev2, num, deep + 1)) {
                    return true;
                }
                res.remove(num);
            }
        }
        return false;
    }
}
