package com.leozhi.topic947;

/**
 * @author leozhi
 * 947. 移除最多的同行或同列石头
 * n 块石头放置在二维平面中的一些整数坐标点上。每个坐标点上最多只能有一块石头。
 *
 * 如果一块石头的 同行或者同列 上有其他石头存在，那么就可以移除这块石头。
 *
 * 给你一个长度为 n 的数组 stones ，其中 stones[i] = [xi, yi] 表示第 i 块石头的位置，返回 可以移除的石子 的最大数量。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        solution.removeStones(new int[][]{{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}});
    }
}