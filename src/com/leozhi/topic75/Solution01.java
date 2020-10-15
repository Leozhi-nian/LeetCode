package com.leozhi.topic75;

/**
 * @author leozhi
 */
public class Solution01 {
    public void sortColors(int[] nums) {
        int fast, slow = 0, temp;
        for (int i = 0; i <= 1; i++) {
            fast = slow;
            while (fast < nums.length) {
                if (nums[fast] == i) {
                    temp = nums[fast];
                    nums[fast] = nums[slow];
                    nums[slow] = temp;
                    slow++;
                }
                fast++;
            }
        }
    }
}