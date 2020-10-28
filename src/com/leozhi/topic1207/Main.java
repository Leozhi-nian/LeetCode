package com.leozhi.topic1207;

/**
 * @author leozhi
 * 1207. 独一无二的出现次数
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 *
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1,2};
        Solution01 solution01 = new Solution01();
        solution01.uniqueOccurrences(array);
    }
}
