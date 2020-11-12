package com.leozhi.topic922;

/**
 * @author leozhi
 * 922. 按奇偶排序数组 II
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 * 你可以返回任何满足上述条件的数组作为答案。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        solution.sortArrayByParityII(new int[]{4,2,5,7});
    }
}
