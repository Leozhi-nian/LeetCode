package com.leozhi.topic57;

/**
 * @author leozhi
 * 57. 插入区间
 * 给出一个无重叠的 ，按照区间起始端点排序的区间列表。
 *
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 */
public class Main {
    public static void main(String[] args) {
        int[][] arrays = {{1, 5}};
        int[] array = {0, 0};
        Solution01 solution01 = new Solution01();
        solution01.insert(arrays, array);
    }
}
