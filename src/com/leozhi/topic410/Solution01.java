package com.leozhi.topic410;

/**
 * @author leozhi
 * 超出时间限制
 */
public class Solution01 {
    public int splitArray(int[] nums, int m) {
        int lo = getMax(nums), hi = getSum(nums);
        for (int max = lo; max <= hi; max++) {
            // 如果最大子数组和是 max，至少可以把 nums 分割成 n 个子数组
            int n = split(nums, max);
            if (n <= m) {
                return max;
            }
        }
        return -1;
    }

    /**
     * 辅助函数，若限制最大子数组和为 max，计算 nums 至少可以被分割成几个子数组
     * @param nums 数组
     * @param max 最大子数组和
     * @return 返回子数组个数
     */
    private int split(int[] nums, int max) {
        // 至少可以分割的子数组数量
        int count = 1;
        // 记录每个子数组的元素和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > max) {
                // 如果当前子数组和大于 max 限制，则这个子数组不能再添加元素了
                count++;
                sum = nums[i];
            } else {
                // 当前子数组和还没达到 max 限制，还可以添加元素
                sum += nums[i];
            }
        }
        return count;
    }

    /**
     * 计算数组中的最大值
     * @param nums 数组
     * @return max
     */
    private int getMax(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        return max;
    }

    /**
     *  计算数组元素和
     * @param nums 数组
     * @return sum
     */
    private int getSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
