package com.leozhi.offer10_I;

/**
 * @author leozhi
 * 迭代
 * 通过
 * 0ms
 */
public class Solution01 {
    public int fib(int n) {
        if (n<3) {
            return n == 0 ? 0 : 1;
        }

        int preview = 1, current = 1;
        for (int i=3; i<=n; i++) {
            int sum = (preview + current) % 1000000007;
            preview = current;
            current = sum;
        }
        return current;
    }
}
