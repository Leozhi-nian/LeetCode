package com.leozhi.topic62;

/**
 * @author leozhi
 * 62. 不同路径
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 问总共有多少条不同的路径？
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        solution.uniquePaths(3, 2);
    }
}
