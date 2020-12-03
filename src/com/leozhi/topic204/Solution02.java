package com.leozhi.topic204;

/**
 * @author leozhi
 * 埃氏筛
 * 通过
 * 27ms
 */
public class Solution02 {
    public int countPrimes(int n) {
        int res = 0;
        int[] nums = new int[n + 1];
        for (int i = 2; i < n; i++) {
            if (nums[i] == 0) {
                ++res;
                for (int j = i; j <= n; j += i) {
                    nums[j] = 1;
                }
            }
        }
        return res;
    }
}
