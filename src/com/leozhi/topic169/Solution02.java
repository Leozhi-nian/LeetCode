package com.leozhi.topic169;

import java.util.Arrays;

/**
 * @author leozhi
 * 排序
 * 通过
 * 2ms
 */
public class Solution02 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
