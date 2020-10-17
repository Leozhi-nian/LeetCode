package com.leozhi.topic912;

/**
 * @author leozhi
 * 归并排序
 * 通过
 * 8ms
 */
public class Solution05 {
    int[] temp;
    public int[] sortArray(int[] nums) {
        temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        int i = left, j = mid + 1;
        int cnt = 0;
        while (i <= mid && j <= right) {
            if (nums[i] < nums[j]) {
                temp[cnt++] = nums[i++];
            }
            else {
                temp[cnt++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[cnt++] = nums[i++];
        }
        while (j <= right) {
            temp[cnt++] = nums[j++];
        }
        for (int k = 0; k < right - left + 1; ++k) {
            nums[k + left] = temp[k];
        }
    }
}
