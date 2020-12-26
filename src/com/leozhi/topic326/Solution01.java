package com.leozhi.topic326;

/**
 * @author leozhi
 * 迭代
 * 通过
 * 17ms
 */
public class Solution01 {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
