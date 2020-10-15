package com.leozhi.topic136;

/**
 * @author leozhi
 * 通过
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
