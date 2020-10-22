package com.leozhi.topic771;

/**
 * @author leozhi
 * 暴力枚举
 * 通过
 * 1ms
 */
public class Solution01 {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int i = 0; i < J.length(); i++) {
            char c = J.charAt(i);
            for (int j = 0; j < S.length(); j++) {
                if (c == S.charAt(j)) {
                    result++;
                }
            }
        }
        return result;
    }
}
