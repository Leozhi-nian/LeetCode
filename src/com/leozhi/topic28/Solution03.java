package com.leozhi.topic28;

/**
 * @author leozhi
 * 比较字符串
 * 通过
 * 0ms
 */
public class Solution03 {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length(), len2 = needle.length();
        for (int start = 0; start < len1 - len2 + 1; start++) {
            if (haystack.substring(start, start + len2).equals(needle)) {
                return start;
            }
        }
        return -1;
    }
}
