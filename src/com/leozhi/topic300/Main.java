package com.leozhi.topic300;

/**
 * @author leozhi
 * 300. 最长上升子序列
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,6,3,5,10,18,9,6,13};
        Solution01 solution01 = new Solution01();
        solution01.lengthOfLIS(nums);
    }
}
