package com.leozhi.topic509;

/**
 * @author leozhi
 * 迭代
 * 通过
 * 0ns
 */
public class Solution01 {
    public int fib(int N) {
        if (N<3) {
            return N == 0 ? 0 : 1;
        }

        int preview = 1, current = 1;
        for (int i=3; i<=N; i++) {
            int sum = preview + current;
            preview = current;
            current = sum;
        }
        return current;
    }
}
