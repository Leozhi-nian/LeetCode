package com.leozhi.topic28;

/**
 * @author leozhi
 * 双指针
 * 通过
 * 2ms
 */
public class Solution01 {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length(), len2 = needle.length(), res = -1;
        if (len2 == 0) {
            return 0;
        }
        for (int i = 0; i < len1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (len2 > len1 - i) {
                    return -1;
                }
                int start = i + 1;
                for (int j = 1; j < len2 && start < len1; start++, j++) {
                    if (haystack.charAt(start) != needle.charAt(j)) {
                        res = -1;
                        break;
                    }
                    res = i;
                }
                if (res != -1) {
                    break;
                }
            }
        }
        return res;
    }
}
