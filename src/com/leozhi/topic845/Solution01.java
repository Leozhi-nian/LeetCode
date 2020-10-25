package com.leozhi.topic845;

/**
 * @author leozhi
 */
public class Solution01 {
    public int longestMountain(int[] A) {
        if (A.length < 3) {
            return 0;
        }
        int length = 0, temp = 0;
        for (int i = 1; i < A.length - 1; i++) {
            int left = i - 1, right = i + 1;
            if (A[i] > A[left] && A[i] > A[right]) {
                temp = 3;
                while (left > 0) {
                    left--;
                    if (A[left] < A[left + 1]) {
                        temp++;
                    }
                }
                while (right < A.length - 1) {
                    right++;
                    if (A[right] < A[right - 1]) {
                        temp++;
                    }
                }
                if (temp > length) {
                    length = temp;
                }
            }
        }
        return length;
    }
}
