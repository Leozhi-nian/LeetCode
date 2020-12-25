package com.leozhi.topic384;

import java.util.Random;

/**
 * @author leozhi
 * 随机数
 * 通过
 * 94ms
 */
public class Solution01 {
    private final int[] initially;
    public Solution01(int[] nums) {
        this.initially = nums;
    }

    public int[] reset() {
        return initially;
    }

    public int[] shuffle() {
        int len = initially.length;
        int[] nums = new int[len];
        System.arraycopy(initially, 0, nums, 0, len);
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            int ran = random.nextInt(len);
            int temp = nums[i];
            nums[i] = nums[ran];
            nums[ran] = temp;
        }
        return nums;
    }
}
