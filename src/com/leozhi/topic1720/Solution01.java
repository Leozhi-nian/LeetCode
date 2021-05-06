package com.leozhi.topic1720;

/**
 * @author leozhi
 * 位运算
 * 通过
 * 2ms
 */
public class Solution01 {
    public int[] decode(int[] encoded, int first) {
        int len = encoded.length;
        int[] arr = new int[len + 1];
        arr[0] = first;
        for (int i = 1; i <= len; i++) {
            arr[i] = encoded[i - 1] ^ arr[i - 1];
        }
        return arr;
    }
}
