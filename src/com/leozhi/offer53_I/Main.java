package com.leozhi.offer53_I;

/**
 * @author leozhi
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 * 统计一个数字在排序数组中出现的次数。
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {5,7,7,8,8,10};
        Solution01 solution01 = new Solution01();
        solution01.search(array, 8);
    }
}
