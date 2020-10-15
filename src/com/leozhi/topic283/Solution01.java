package com.leozhi.topic283;

/**
 * @author leozhi
 */
public class Solution01 {
    public void moveZeroes(int[] nums) {
        // 快慢双指针
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        for (; slow < nums.length; slow++) {
            nums[slow] = 0;
        }
    }
}
