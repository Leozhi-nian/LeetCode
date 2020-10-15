package com.leozhi.topic26;

/**
 * @author leozhi
 */
public class Solution01 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                continue;
            }
            i++;
            nums[i] = nums[j];
        }
        return i + 1;
    }
}
