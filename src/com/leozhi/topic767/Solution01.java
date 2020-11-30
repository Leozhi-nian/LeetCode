package com.leozhi.topic767;

import java.util.Arrays;

/**
 * @author leozhi
 * 未通过
 */
public class Solution01 {
    public String reorganizeString(String S) {
        int len = S.length();
        char[] chars = S.toCharArray();
        int[][] table = new int[26][2];
        for (int i = 0; i < len; i++) {
            table[chars[i] - 'a'][0] = chars[i];
            if (++table[chars[i] - 'a'][1] > (len + 1) / 2) {
                return "";
            }
        }
        Arrays.sort(table, (o1, o2) -> o2[1] - o1[1]);
        int index = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < table[i][1]; j++) {
                chars[index++] = (char)(table[i][0]);
            }
        }
        for (int i = 0; i < table[0][1]; i++) {
            for (int j = 1; j < len - 1; j++) {
                if (chars[j] == chars[j - 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }
        // vvvvvdejs
        // aabbcc
        return String.valueOf(chars);
    }
}
