package com.leozhi.topic5;

/**
 * @author leozhi
 * 中心拓展 + 双指针
 * 通过
 * 43ms
 */
public class Solution01 {
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            // 字符串长度为奇数
            String s1 = palindrome(s, i, i);
            // 字符串长度为偶数
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
        // String的substring()方法获取到的字符串包括左值，不包括右值
        return s.substring(left + 1, right);
    }
}
