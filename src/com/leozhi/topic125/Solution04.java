package com.leozhi.topic125;

/**
 * @author leozhi
 * 左右指针
 * 通过
 * 5ms
 */
public class Solution04 {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0, right = n -1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
