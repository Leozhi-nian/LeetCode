package com.leozhi.lcp19;

/**
 * @author leozhi
 * 通过
 * 21ms
 */
public class Solution02 {
    public int minimumOperations(String leaves) {
        int n = leaves.length();
        int l1 = leaves.charAt(0) == 'y' ? 1 : 0;
        int l2 = n + 1, l3 = l2;
        for (int i = 1; i < n; i++) {
            int isRed = leaves.charAt(i) == 'r' ? 1 : 0;
            int isYellow = leaves.charAt(i) == 'y' ? 1 : 0;
            if (i >= 2) {
                l3 = Math.min(l2, l3) + isYellow;
            }
            l2 = Math.min(l1, l2) + isRed;
            l1 += isYellow;
        }
        return l3;
    }
}
