package com.leozhi.topic922;

/**
 * @author leozhi
 * 双指针
 * 通过
 * 3ms
 */
public class Solution01 {
    public int[] sortArrayByParityII(int[] A) {
        int n = A.length;
        int even = 0, odd = 1;
        while (even < n && odd < n) {
            while (even < n && A[even] % 2 == 0) {
                even += 2;
            }
            while (odd < n && A[odd] % 2 == 1) {
                odd += 2;
            }
            if (even >= n || odd >= n) {
                break;
            }
            int temp = A[even];
            A[even] = A[odd];
            A[odd] = temp;
            even += 2;
            odd += 2;
        }
        return A;
    }
}
