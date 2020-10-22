package com.leozhi.topic242;

/**
 * @author leozhi
 * 哈希表
 * 官方题解
 * 通过
 * 5ms
 */
public class Solution03 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (--table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
