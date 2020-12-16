package com.leozhi.topic78;

/**
 * @author leozhi
 * 78. 子集
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * 说明：解集不能包含重复的子集。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        solution.subsets(new int[]{1, 2, 3});
    }
}
