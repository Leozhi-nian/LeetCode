package com.leozhi.topic275;

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 0ms
 */
public class Solution01 {
    public int hIndex(int[] citations) {
        int n = citations.length, left = 0, right = n - 1, mid, res = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (citations[mid] >= n - mid) {
                res = n - mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
}
