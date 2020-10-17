package com.leozhi.topic912;

/**
 * @author leozhi
 * 选择排序
 * 通过
 * 1179ms
 */
public class Solution02 {
    public int[] sortArray(int[] nums) {
        int minIndex, temp;
        for (int i = 0; i < nums.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
    }
}
