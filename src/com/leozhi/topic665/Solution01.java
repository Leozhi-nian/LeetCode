package com.leozhi.topic665;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 1ms
 */
public class Solution01 {
    public boolean checkPossibility(int[] nums) {
        // 示例 1：[4, 2, 3] -> [2, 2, 3]
        // 示例 2：[3, 4, 2, 3] -> [3, 4, 4, 3] -> [3, 4, 4, 4]

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1];
                } else {
                    nums[i + 1] = nums[i];
                }
                if (++count > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
