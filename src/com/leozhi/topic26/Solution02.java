package com.leozhi.topic26;

/**
 * @author leozhi
 * 快慢指针
 * 通过
 * 1ms
 */
public class Solution02 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // 快慢双指针
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}
