package com.leozhi.topic493;

/**
 * @author leozhi
 * 493. 翻转对
 * 给定一个数组 nums ，如果 i < j 且 nums[i] > 2*nums[j] 我们就将 (i, j) 称作一个重要翻转对。
 *
 * 你需要返回给定数组中的重要翻转对的数量。
 */
public class Main {
    public static void main(String[] args) {
        Solution02 solution = new Solution02();
        solution.reversePairs(new int[]{10,12,3,0,14,3,16,6,12,7,3,6,1,2,12,17,14,0,1,18});
    }
}
