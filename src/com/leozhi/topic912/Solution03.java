package com.leozhi.topic912;

/**
 * @author leozhi
 * 插入排序
 * 通过
 * 1465ms
 */
public class Solution03 {
    public int[] sortArray(int[] nums) {
        int temp;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        return nums;
    }
}
