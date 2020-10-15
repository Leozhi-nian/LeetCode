package com.leozhi.topic9;

/**
 * @author leozhi
 * 通过
 */
public class Solution01 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x, n = 0;
        while (x > 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        return temp == n;
    }
}
