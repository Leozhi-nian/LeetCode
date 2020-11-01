package com.leozhi.topic392;

/**
 * @author leozhi
 * 双指针
 * 通过
 * 2ms
 */
public class Solution04 {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        } else if(t.length() == 0) {
            return false;
        }
        int i = 0, j = 0;
        while (i < s.length()) {
            j = i;
            while (j < t.length()) {
                if (s.charAt(i) == t.charAt(j)) {
                    i++;
                    break;
                } else {
                    if (++j == t.length()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
