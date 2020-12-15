package com.leozhi.topic738;

/**
 * @author leozhi
 * 738. 单调递增的数字
 * 给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。
 *
 * （当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。）
 *
 * 说明: N 是在 [0, 10^9] 范围内的一个整数。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        solution.monotoneIncreasingDigits(998841);
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
