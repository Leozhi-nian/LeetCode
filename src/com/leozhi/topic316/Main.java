package com.leozhi.topic316;

/**
 * @author leozhi
 * 316. 去除重复字母
 * 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        solution.removeDuplicateLetters("bcabc");
    }
}
