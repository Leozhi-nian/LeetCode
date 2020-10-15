package com.leozhi.topic344;

/**
 * @author leozhi
 */
public class Solution01 {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        char temp;
        while (left < s.length / 2) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
