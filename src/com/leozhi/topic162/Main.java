package com.leozhi.topic162;

/**
 * @author leozhi
 * 162. 寻找峰值
 * 峰值元素是指其值大于左右相邻值的元素。
 *
 * 给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
 *
 * 数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
 *
 * 你可以假设 nums[-1] = nums[n] = -∞。
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,3,2};
        Solution01 solution01 = new Solution01();
        solution01.findPeakElement(array);
    }
}
