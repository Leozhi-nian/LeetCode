package com.leozhi.topic198;

/**
 * @author leozhi
 */
public class Solution01 {
    public int rob(int[] nums) {
        return rec(nums, nums.length - 1);
    }

    public int rec(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        } else if (n == 1) {
            return Math.max(arr[0], arr[1]);
        } else {
            return Math.max(rec(arr, n-2) + arr[n], rec(arr, n-1));
        }
    }
}
