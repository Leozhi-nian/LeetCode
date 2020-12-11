package com.leozhi.topic42;

/**
 * @author leozhi
 * 42. 接雨水
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 */
public class Main {
    public static void main(String[] args) {
        Solution04 solution = new Solution04();
        solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
    }
}
