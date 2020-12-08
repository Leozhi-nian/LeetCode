package com.leozhi.topic401;

/**
 * @author leozhi
 * 401. 二进制手表
 * 二进制手表顶部有 4 个 LED 代表 小时（0-11），底部的 6 个 LED 代表 分钟（0-59）。
 * <p>
 * 每个 LED 代表一个 0 或 1，最低位在右侧。
 * <p>
 * 0011
 * 011001
 * <p>
 * 例如，上面的二进制手表读取 “3:25”。
 * <p>
 * 给定一个非负整数 n 代表当前 LED 亮着的数量，返回所有可能的时间。
 */
public class Main {
    public static void main(String[] args) {
        Solution03 solution = new Solution03();
        solution.readBinaryWatch(2);
    }
}
