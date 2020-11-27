package com.leozhi.topic1370;

/**
 * @author leozhi
 * 桶计数
 * 官方题解
 * 通过
 *
 */
public class Solution02 {
    public String sortString(String s) {
        int[] bucket = new int[26];
        for (int i = 0; i < s.length(); i++) {
            bucket[s.charAt(i) - 'a']++;
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
