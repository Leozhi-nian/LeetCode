package com.leozhi.topic767;

/**
 * @author leozhi
 * 767. 重构字符串
 * 给定一个字符串S，检查是否能重新排布其中的字母，使得两相邻的字符不同。
 *
 * 若可行，输出任意可行的结果。若不可行，返回空字符串。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        solution.reorganizeString("aabbcc");
    }
}
