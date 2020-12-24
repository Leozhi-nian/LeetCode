package com.leozhi.topic461;

/**
 * @author leozhi
 * 位运算
 * 通过
 * 0ms
 */
public class Solution01 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
