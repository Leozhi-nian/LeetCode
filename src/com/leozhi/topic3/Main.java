package com.leozhi.topic3;

/**
 * @author leozhi
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Solution01 solution01 = new Solution01();
        solution01.lengthOfLongestSubstring(s);
    }
}
