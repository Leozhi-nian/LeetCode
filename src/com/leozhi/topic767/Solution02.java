package com.leozhi.topic767;

/**
 * @author leozhi
 * 基于计数的贪心算法
 * 官方题解
 * 通过
 * 1ms
 */
public class Solution02 {
    public String reorganizeString(String S) {
        int len = S.length();
        if (len < 2) {
            return S;
        }
        int[] counts = new int[26];
        int maxCount = 0;
        for (int i = 0; i < len; i++) {
            char c = S.charAt(i);
            ++counts[c - 'a'];
            maxCount = Math.max(maxCount, counts[c - 'a']);
        }
        if (maxCount > (len + 1) / 2) {
            return "";
        }
        char[] reorganizeArray = new char[len];
        int evenIndex = 0, oddIndex = 1;
        int halfLength = len / 2;
        for (int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            while (counts[i] > 0 && counts[i] <= halfLength && oddIndex < len) {
                reorganizeArray[oddIndex] = c;
                --counts[i];
                oddIndex += 2;
            }
            while (counts[i] > 0) {
                reorganizeArray[evenIndex] = c;
                --counts[i];
                evenIndex += 2;
            }
        }
        return new String(reorganizeArray);
    }
}
