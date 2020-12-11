package com.leozhi.topic376;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 0ms
 */
public class Solution01 {
    public int wiggleMaxLength(int[] nums) {
        int len = nums.length, res = 1;
        // 序列元素个数小于 2 个时直接返回
        if (len <= 1) {
            return len;
        }
        // 初始状态为前两个元素之差（第一个元素 - 第二个元素）
        int status = nums[0] - nums[1];
        for (int i = 1; i < len; i++) {
            // 如果初始元素之差为 0 ，即初始元素相同则初始元素向后推移
            if (status == 0) {
                status = nums[i - 1] - nums[i];
            }
            // 差值互为相反数则更新状态，并增加返回结果
            if ((nums[i] - nums[i - 1]) * status < 0) {
                status = nums[i] - nums[i - 1];
                ++res;
            }
        }
        return res;
    }
}
