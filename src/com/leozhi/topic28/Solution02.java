package com.leozhi.topic28;

/**
 * @author leozhi
 * 双指针
 * 通过
 * 3ms
 */
public class Solution02 {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length(), len2 = needle.length();
        if (len2 == 0) {
            return 0;
        }
        for (int i = 0; i <= len1 - len2; i++) {
            for (int j = 0; j < len2; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == len2 - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
