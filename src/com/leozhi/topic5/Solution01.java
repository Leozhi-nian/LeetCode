package com.leozhi.topic5;

/**
 * @author leozhi
 * 通过
 */
public class Solution01 {
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i + 1);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }

    private String palindrome(String s, int left, int right) {
        // 防止索引越界
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            // 向两边展开
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
