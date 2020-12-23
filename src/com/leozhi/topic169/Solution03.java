package com.leozhi.topic169;

/**
 * @author leozhi
 * Boyer-Moore 投票算法
 * 官方题解
 * 通过
 * 3ms
 */
public class Solution03 {
    public int majorityElement(int[] nums) {
        int count = 0;
        // 候选众数
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        assert candidate != null;
        return candidate;
    }
}
