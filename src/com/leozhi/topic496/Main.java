package com.leozhi.topic496;

/**
 * @author leozhi
 * 496. 下一个更大元素 I
 * 给定两个 没有重复元素 的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。找到 nums1 中每个元素在 nums2 中的下一个比其大的值。
 *
 * nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出 -1 。
 */
public class Main {
    public static void main(String[] args) {
        Solution03 solution = new Solution03();
        solution.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 5, 2, 4});
    }
}
