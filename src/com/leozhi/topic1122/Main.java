package com.leozhi.topic1122;

/**
 * @author leozhi
 * 1122. 数组的相对排序
 * 给你两个数组，arr1 和 arr2，
 *
 * arr2 中的元素各不相同
 * arr2 中的每个元素都出现在 arr1 中
 * 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        int[] arr1 = {28,6,22,8,44,17};
        int[] arr2 = {22,28,8,6};
        solution.relativeSortArray(arr1, arr2);
    }
}
