package com.leozhi.topic342;

/**
 * @author leozhi
 * 数学计算
 * 通过
 * 1ms
 */
public class Solution01 {
    public boolean isPowerOfFour(int n) {
        double res = Math.log(n) / Math.log(4);
        return res - (int)res == 0;
    }
}
