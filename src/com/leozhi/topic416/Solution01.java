package com.leozhi.topic416;

/**
 * @author leozhi
 * 通过
 */
public class Solution01 {
    public boolean canPartition(int[] nums) {
        // 数组元素个数小于2个是，不可能分为2个元素和相等的子数组
        if (nums.length < 2) {
            return false;
        }
        int sum = 0, maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        // 数组元素和为奇数时，不可能分为2个元素和相等的子数组
        // 数组中最大元素大于元素和一半时，不可能分为2个元素和相等的子数组
        if (sum % 2 != 0 || maxNum > sum / 2) {
            return false;
        }
        int target = sum / 2, n = nums.length;
        boolean[][] dp = new boolean[n][target + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            for (int j = 1; j <= target; j++) {
                if (j >= num) {
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - num];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n - 1][target];
    }
}
