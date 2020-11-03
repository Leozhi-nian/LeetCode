package com.leozhi.topic941;

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 3ms
 */
public class Solution01 {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int left = 0, right = A.length - 1;
        while (left < right && (A[left] < A[left + 1] || A[right] < A[right - 1])) {
            if (A[left] < A[left + 1]) {
                left++;
            }
            if (A[right] < A[right - 1]) {
                right--;
            }
        }
        return left == right && left != 0 && right != A.length - 1;
    }
}
