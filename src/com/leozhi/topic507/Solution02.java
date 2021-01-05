package com.leozhi.topic507;

/**
 * @author leozhi
 * 欧几里德-欧拉定理 梅森素数
 * 通过
 * 0ms
 */
public class Solution02 {
    public boolean checkPerfectNumber(int num) {
        int[] primes = new int[]{2, 3, 5, 7, 13, 17, 19, 31};
        for (int prime : primes) {
            if (perfectNumber(prime) == num) {
                return true;
            }
        }
        return false;
    }

    private int perfectNumber(int p) {
        return (1 << (p - 1)) * ((1 << p) - 1);
    }
}
