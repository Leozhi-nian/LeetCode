package com.leozhi.topic350;

/**
 * @author leozhi
 *
 * 350. 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Solution02 solution02 = new Solution02();
        solution02.intersect(nums1, nums2);
    }
}
