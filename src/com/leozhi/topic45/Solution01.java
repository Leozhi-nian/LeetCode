package com.leozhi.topic45;

import java.util.Arrays;

/**
 * @author leozhi
 * 动态规划 dp函数
 * 失败
 * 超时
 */
public class Solution01 {
    int[] memo;
    public int jump(int[] nums) {
        int n = nums.length;
        memo = new int[n];
        // 备忘录元素全部初始化为 n，因为从 0 跳到最后一共需要 n - 1 步
        Arrays.fill(memo, n);
        return dp(nums, 0);
    }

    private int dp(int[] nums, int p) {
        int n = nums.length;
        // base case
        if (p >= n - 1) {
            return 0;
        }
        // 查看备忘录中是否已记录
        if (memo[p] != n) {
            return memo[p];
        }
        // 当前位置最多可跳的步数
        int steps = nums[p];
        // 遍历跳 [1, steps] 步后所处位置到终点的最小步次数
        for (int i = 1; i <= steps; i++) {
            int subProblem = dp(nums, p + i);
            memo[p] = Math.min(subProblem + 1, memo[p]);
        }
        return memo[p];
    }
}
