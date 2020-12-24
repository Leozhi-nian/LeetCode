package com.leozhi.topic342;

/**
 * @author leozhi
 * 位运算
 * 通过
 * 1ms
 */
public class Solution02 {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) != 0 && (n & 1431655765) == 0;
    }
}
