package com.leozhi.topic852;

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 0ms
 */
public class Solution03 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
