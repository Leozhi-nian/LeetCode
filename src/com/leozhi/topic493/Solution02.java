package com.leozhi.topic493;

/**
 * @author leozhi
 * 归并排序
 * 官方题解
 * 通过
 * 56ms
 */
public class Solution02 {
    public int reversePairs(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return 0;
        }
        return reversePairsRecursive(nums, 0, len - 1);
    }

    private int reversePairsRecursive(int[] nums, int left, int right) {
        if (left == right) {
            return 0;
        } else {
            int mid = left + (right - left) / 2;
            int n1 = reversePairsRecursive(nums, left, mid);
            int n2 = reversePairsRecursive(nums, mid + 1, right);
            int res = n1 + n2;

            int i = left;
            int j = mid + 1;
            while (i <= mid) {
                while (j <= right && (nums[i] + (nums[i] < 0 ? -1 : 1)) / 2 > nums[j]) {
                    j++;
                }
                res += j - mid - 1;
                i++;
            }

            int[] sorted = new int[right - left + 1];
            int p1 = left, p2 = mid + 1;
            int p = 0;
            while (p1 <= mid || p2 <= right) {
                if (p1 > mid) {
                    sorted[p++] = nums[p2++];
                } else if (p2 > right) {
                    sorted[p++] = nums[p1++];
                } else {
                    if (nums[p1] < nums[p2]) {
                        sorted[p++] = nums[p1++];
                    } else {
                        sorted[p++] = nums[p2++];
                    }
                }
            }
            for (int k = 0; k < sorted.length; k++) {
                nums[left + k] = sorted[k];
            }
            return res;
        }
    }
}
