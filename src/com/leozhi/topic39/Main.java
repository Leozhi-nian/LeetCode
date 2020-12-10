package com.leozhi.topic39;

/**
 * @author leozhi
 * 39. 组合总和
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的数字可以无限制重复被选取。
 *
 * 说明：
 *
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。 
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        solution.combinationSum(new int[]{2, 3, 6, 7}, 7);
    }
}
