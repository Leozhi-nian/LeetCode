package com.leozhi.topic88;

/**
 * @author leozhi
 * 88. 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 * 说明：
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 */
public class Main {
    public static void main(String[] args) {
        Solution03 solution03 = new Solution03();
        int[] array1 = {4,5,6,0,0,0};
        int[] array2 = {1,2,3};
        solution03.merge(array1, 3, array2, 3);
    }
}
