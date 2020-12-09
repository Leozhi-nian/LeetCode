package com.leozhi.topic47;

/**
 * @author leozhi
 * 47. 全排列 II
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 2};
        Solution02 solution = new Solution02();
        solution.permuteUnique(array);
    }
}
