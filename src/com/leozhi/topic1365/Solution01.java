package com.leozhi.topic1365;

import java.util.Arrays;

/**
 * @author leozhi
 * 哈希表
 * 通过
 * 2ms
 */
public class Solution01 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = new int[nums.length];
        System.arraycopy(nums, 0, sorted, 0, nums.length);
        Arrays.sort(sorted);
        int[] count = new int[101];
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] != sorted[0] && count[sorted[i]] == 0) {
                count[sorted[i]] =i;
            }
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = count[nums[i]];
        }
        return res;
    }
}
