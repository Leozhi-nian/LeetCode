package com.leozhi.topic152;

/**
 * @author leozhi
 * 暴力
 * 通过
 */
public class Solution01 {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp > result) {
                result = temp;
            }
            for (int j = i + 1; j < nums.length; j++) {
                temp = temp * nums[j];
                if (temp > result) {
                    result = temp;
                }
            }
        }
        return result;
    }
}
