package com.leozhi.topic1137;

/**
 * @author leozhi
 * 迭代
 * 通过
 * 0ms
 */
public class Solution01 {
    public int tribonacci(int n) {
        if (n<3) {
            return n == 0 ? 0 : 1;
        }

        int first = 0, second = 1, third = 1;
        for (int i=3; i<=n; i++) {
            int sum = first + second + third;
            first = second;
            second = third;
            third = sum;
        }
        return third;
    }
}
