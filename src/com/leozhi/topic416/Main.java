package com.leozhi.topic416;

/**
 * @author leozhi
 * 416. 分割等和子集
 * 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 4};
        Solution01 solution01 = new Solution01();
        solution01.canPartition(array);
    }
}
