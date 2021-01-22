package com.leozhi.topic989;

import java.util.LinkedList;
import java.util.List;

/**
 * @author leozhi
 * 逐位相加
 * 通过
 * 6ms
 */
public class Solution01 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new LinkedList<>();
        int len = A.length, carry = 0;
        for (int i = len - 1; i >= 0; i--) {
            int sum = A[i] + K % 10;
            res.add(0, sum % 10);
            K = K / 10;
            K += sum / 10;
        }
        while (K != 0) {
            res.add(0, K % 10);
            K /= 10;
        }
        return res;
    }
}
