package com.leozhi.topic209;

/**
 * @author leozhi
 */
public class Solution01 {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0, right = 0, sum = 0, ans = Integer.MAX_VALUE;
        while (right < nums.length) {
            int n = nums[right];
            right++;
            sum += n;
            while (sum >= s) {
                if (right - left < ans) {
                    ans = right - left;
                }
                sum -= nums[left];
                left++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
