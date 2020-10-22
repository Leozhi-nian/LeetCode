package com.leozhi.topic242;

import java.util.Arrays;

/**
 * @author leozhi
 * 排序
 * 官方题解
 * 通过
 * 3ms
 */
public class Solution02 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}
