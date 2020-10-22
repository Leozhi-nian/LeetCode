package com.leozhi.topic75;

/**
 * @author leozhi
 * 三路快速排序
 * 通过
 * 0ms
 */
public class Solution02 {
    public void sortColors(int[] nums) {
        int zero = -1, two = nums.length, temp;
        for (int i = 0; i < two;) {
            if (nums[i] == 1) {
                // 元素为 1 时，不更换元素
                i++;
            } else if (nums[i] == 2) {
                // 元素为 2 时，将其与右侧的值交换
                two--;
                temp = nums[i];
                nums[i] = nums[two];
                nums[two] = temp;
            } else {
                // 元素为 0 时，将其与左侧的值交换
                zero++;
                temp = nums[i];
                nums[i] = nums[zero];
                nums[zero] = temp;
                i++;
            }
        }
    }
}
