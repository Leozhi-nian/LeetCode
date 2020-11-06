package com.leozhi.topic1356;

import java.util.Arrays;

/**
 * @author leozhi
 * 两次循环 修改数组
 * 通过
 * 3ms
 */
public class Solution02 {
    public int[] sortByBits(int[] arr) {
        // 将 arr 中各元素二进制表示中 1 的个数和元素值使用一个数字进行表示，其中 1 的个数权重较大
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.bitCount(arr[i]) * 100000 + arr[i];
        }
        // 对数组进行排序
        Arrays.sort(arr);
        // 将数组还原
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 100000;
        }
        return arr;
    }
}
