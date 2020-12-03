package com.leozhi.topic204;

/**
 * @author leozhi
 * 暴力枚举 + 试除法
 * 超时
 */
public class Solution01 {
    public int countPrimes(int n) {
        int res = 0;
        for (int i = 2; i < n; ++i) {
            res += judgePrime(i) ? i : 0;
        }
        return res;
    }
    
    private boolean judgePrime(int n) {
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
