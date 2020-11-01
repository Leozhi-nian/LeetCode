package com.leozhi.topic392;

/**
 * @author leozhi
 * 双指针
 * 官方题解
 * 通过
 * 1ms
 */
class Solution05 {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
}