package com.leozhi.topic520;

/**
 * @author leozhi
 * 大小写转换
 * 通过
 * 2ms
 */
public class Solution01 {
    public boolean detectCapitalUse(String word) {
        String upperCase = word.toUpperCase();
        String lower = word.toLowerCase();
        if (word.equals(upperCase)) {
            return true;
        } else if (word.equals(lower)) {
            return true;
        } else {
            return word.substring(1).equals(lower.substring(1));
        }
    }
}
