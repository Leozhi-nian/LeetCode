package com.leozhi.topic402;

/**
 * @author leozhi
 * 402. 移掉K位数字
 * 给定一个以字符串表示的非负整数 num，移除这个数中的 k 位数字，使得剩下的数字最小。
 *
 * 注意:
 *
 * num 的长度小于 10002 且 ≥ k。
 * num 不会包含任何前导零。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        System.out.println(solution.removeKdigits("158458991586115488787778545448877845984558545465025211111", 30));
    }
}
