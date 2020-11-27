package com.leozhi.topic455;

import java.util.Arrays;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 8ms
 */
public class Solution02 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0, cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (g[child] <= s[cookie]) {
                child++;
            }
            cookie++;
        }
        return child;
    }
}
