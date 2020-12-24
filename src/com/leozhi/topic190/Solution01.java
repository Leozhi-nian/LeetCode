package com.leozhi.topic190;

/**
 * @author leozhi
 * 位运算
 * 通过
 * 1ms
 */
public class Solution01 {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res += n & 1;
            n >>= 1;
        }
        return res;
    }
}
