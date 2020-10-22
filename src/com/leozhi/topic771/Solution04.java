package com.leozhi.topic771;

/**
 * @author leozhi
 * 位运算
 * 通过
 * 1ms
 */
public class Solution04 {
    public int numJewelsInStones(String J, String S) {
        long xor = 0;
        for (int i = 0; i < J.length(); i++) {
            xor |= 1L << (J.charAt(i) - 'A');
        }
        int res = 0;
        for (int i = 0; i < S.length(); i++) {
            if ((xor & (1L << (S.charAt(i) - 'A'))) != 0) {
                res++;
            }
        }
        return res;
    }
}
