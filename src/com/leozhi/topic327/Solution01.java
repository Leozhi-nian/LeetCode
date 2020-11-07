package com.leozhi.topic327;

/**
 * @author leozhi
 * 暴力
 * 通过
 * 251ms
 */
public class Solution01 {
    public int countRangeSum(int[] nums, int lower, int upper) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j >= 0; j--) {
                int temp = sum;
                sum += nums[j];
                // 判断区间和是否满足条件，且区间和为非溢出所得
                if (sum >= lower && sum <= upper && !isOverflow(temp, nums[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 判断两数相加是否溢出
     */
    boolean isOverflow(int x, int y) {
        int z = x + y;
        if (x > 0 && y > 0 && z < 0) {
            return true;
        } else {
            return x < 0 && y < 0 && z > 0;
        }
    }
}
