package com.leozhi.offer56_I;

/**
 * @author leozhi
 * 剑指 Offer 56 - I. 数组中数字出现的次数
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        solution.singleNumbers(new int[]{4, 1, 4, 6});
    }
}
