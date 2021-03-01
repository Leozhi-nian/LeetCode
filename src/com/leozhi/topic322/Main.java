package com.leozhi.topic322;

/**
 * @author leozhi
 * 322. 零钱兑换
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 * 你可以认为每种硬币的数量是无限的。
 */
public class Main {
    public static void main(String[] args) {
        Solution02 solution = new Solution02();
        int[] array = {1, 2, 5};
        solution.coinChange(array, 11);
    }
}
