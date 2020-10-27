package com.leozhi.topic45;

/**
 * @author leozhi
 * 45. 跳跃游戏 II
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {2,3,1,1,4};
        Solution02 solution02 = new Solution02();
        solution02.jump(array);
    }
}
