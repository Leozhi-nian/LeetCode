package com.leozhi.topic242;

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 4ms
 */
public class Solution04 {
    public boolean isAnagram(String s, String t) {
        int m = s.length(), n = t.length();
        if (m != n) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < m; i++) {
            table[s.charAt(i) - 'a']++;
            table[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (table[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
