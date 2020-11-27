package com.leozhi.topic1370;

/**
 * @author leozhi
 * 桶计数
 * 通过
 * 2ms
 */
public class Solution01 {
    public String sortString(String s) {
        int[] bucket = new int[26];
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            bucket[c - 'a']++;
        }
        char[] res = new char[s.length()];
        int index = 0;
        while (index < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (bucket[i] != 0) {
                    res[index++] = (char)(i + 'a');
                    bucket[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (bucket[i] != 0) {
                    res[index++] = (char)(i + 'a');
                    bucket[i]--;
                }
            }
        }
        return new String(res);
    }
}
