package com.leozhi.topic125;

/**
 * @author leozhi
 * 筛选 + 左右指针
 * 通过
 * 5ms
 */
public class Solution02 {
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 48 && chars[i] <= 57) {
                stringBuilder.append(chars[i]);
            }
            if (chars[i] >= 65 && chars[i] <= 90) {
                stringBuilder.append(chars[i]);
            }
            if (chars[i] >= 97 && chars[i] <= 122) {
                stringBuilder.append(chars[i]);
            }
        }
        s = stringBuilder.toString().toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
