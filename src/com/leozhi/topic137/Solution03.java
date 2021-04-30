package com.leozhi.topic137;

/**
 * @author leozhi
 * 位运算
 * 通过
 * 0ms
 */
public class Solution03 {
    public int singleNumber(int[] nums) {
        int seenOnce = 0;
        int seenTwice = 0;
        for (int num : nums) {
            seenOnce = ~seenTwice & (seenOnce ^ num);
            seenTwice = ~seenOnce & (seenTwice ^ num);
        }
        return seenOnce;
    }
}
