package com.leozhi.topic136;

/**
 * @author leozhi
 * 位运算
 * 通过
 * 1ms
 */
public class Solution03 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
