package com.leozhi.topic912;

/**
 * @author leozhi
 * 冒泡排序
 * 运行失败
 * 超出时间限制
 */
public class Solution01 {
    public int[] sortArray(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
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
