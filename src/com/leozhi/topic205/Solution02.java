package com.leozhi.topic205;

/**
 * @author leozhi
 * 判断索引
 * 通过
 * 4ms
 */
public class Solution02 {
    public boolean isIsomorphic(String s, String t) {
        int[] preIndexOfS = new int[256];
        int[] preIndexOfT = new int[256];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (preIndexOfS[charS] != preIndexOfT[charT]) {
                return false;
            }
            preIndexOfS[charS] = i + 1;
            preIndexOfT[charT] = i + 1;
        }
        return true;
    }
}
