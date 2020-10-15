package com.leozhi.topic14;

/**
 * @author leozhi
 */
public class Solution01 {
    public String longestCommonPrefix(String[] strs) {
        String commonPre;
        if (strs.length != 0) {
            commonPre = strs[0];
        } else {
            return "";
        }
        for (String s : strs) {
            if (s.length() < commonPre.length()) {
                commonPre = s;
            }
        }
        for (int i = commonPre.length() - 1; i >= 0; i--) {
            for (String str : strs) {
                if (str.charAt(i) != commonPre.charAt(i)) {
                    commonPre = commonPre.substring(0, i);
                    break;
                }
            }
        }
        return commonPre;
    }
}
