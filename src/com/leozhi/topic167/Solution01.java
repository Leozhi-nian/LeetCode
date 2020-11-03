package com.leozhi.topic167;

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 4ms
 */
public class Solution01 {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] res = new int[2];
        for (int i = 0; i < n; i++) {
            int diff = target - numbers[i];
            int left = i + 1, right = n - 1, mid;
            while (left <= right) {
                mid = left + (right - left) / 2;
                if (diff == numbers[mid]) {
                    return new int[]{i + 1, mid + 1};
                } else if (diff < numbers[mid]) {
                    right = mid - 1;
                } else if (diff > numbers[mid]) {
                    left = mid + 1;
                }
            }
        }
        return res;
    }
}
