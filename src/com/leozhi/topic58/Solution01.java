package com.leozhi.topic58;

/**
 * @author leozhi
 * 反向遍历
 * 通过
 * 0ms
 */
public class Solution01 {
    public int lengthOfLastWord(String s) {
        int res = 0;
        boolean isSpace;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                isSpace = true;
            } else {
                isSpace = false;
                ++res;
            }
            if (isSpace && res != 0) {
                break;
            }
        }
        return res;
    }
}
