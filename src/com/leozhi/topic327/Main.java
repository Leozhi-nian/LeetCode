package com.leozhi.topic327;

/**
 * @author leozhi
 * 327. 区间和的个数
 * 给定一个整数数组 nums，返回区间和在 [lower, upper] 之间的个数，包含 lower 和 upper。
 * 区间和 S(i, j) 表示在 nums 中，位置从 i 到 j 的元素之和，包含 i 和 j (i ≤ j)。
 *
 * 说明:
 * 最直观的算法复杂度是 O(n2) ，请在此基础上优化你的算法。
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {2147483647,-2147483648,-1,0};
        Solution01 solution = new Solution01();
        solution.countRangeSum(array, -1, 0);
    }
}
