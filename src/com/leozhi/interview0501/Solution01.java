package com.leozhi.interview0501;

/**
 * @author leozhi
 * 位运算
 * 通过
 * 0ms
 */
public class Solution01 {
    public int insertBits(int N, int M, int i, int j) {
        int mask = ((1 << (j - i + 1)) - 1) << i;
        mask = ~mask;
        N &= mask;
        M = M << i;
        return M | N;
    }
}
