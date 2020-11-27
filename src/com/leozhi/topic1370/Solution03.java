package com.leozhi.topic1370;

/**
 * @author leozhi
 */
public class Solution03 {
    public String sortString(String s) {
        int[] bucket = new int[26];
        for (char c : s.toCharArray()) {
            bucket[c - 'a']++;
        }
        StringBuilder res = new StringBuilder();
        while (res.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (bucket[i] > 0) {
                    res.append((char)(i + 'a'));
                    bucket[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (bucket[i] > 0) {
                    res.append((char)(i + 'a'));
                    bucket[i]--;
                }
            }
        }
        return res.toString();
    }
}
