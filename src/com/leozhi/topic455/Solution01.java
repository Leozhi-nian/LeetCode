package com.leozhi.topic455;

import java.util.Arrays;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 7ms
 */
public class Solution01 {
    public int findContentChildren(int[] g, int[] s) {
        int res = 0, m = g.length, n = s.length, temp = -1;
        // 排序两个数组
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i : g) {
            // 当剩余饼干无法满足第 i 个孩子时直接结束循环，返回结果
            if (temp == n - 1) {
                break;
            }
            for (int j = temp + 1; j < n; j++) {
                // 第 j 个饼干恰好是第一个能满足第 i 个孩子的饼干
                if (s[j] >= i) {
                    res++;
                    temp = j;
                    break;
                }
                // 从第 temp 到最后的饼干都无法满足第 i 个孩子了，则也不可能满足第 i 个孩子后面的孩子了
                if (j == n - 1) {
                    temp = n - 1;
                }
            }
        }
        return res;
    }
}
