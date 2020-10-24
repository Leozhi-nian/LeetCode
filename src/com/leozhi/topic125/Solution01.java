package com.leozhi.topic125;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leozhi
 * 正则匹配 + 左右指针
 * 通过
 * 21ms
 */
public class Solution01 {
    Pattern pattern = Pattern.compile("[a-zA-Z0-9]");
    public boolean isPalindrome(String s) {
        Matcher matcher = pattern.matcher(s);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            stringBuilder.append(matcher.group());
        }
        s = stringBuilder.toString().toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
