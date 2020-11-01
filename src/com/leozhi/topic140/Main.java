package com.leozhi.topic140;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leozhi
 * 140. 单词拆分 II
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，在字符串中增加空格来构建一个句子，使得句子中所有的单词都在词典中。返回所有这些可能的句子。
 *
 * 说明：
 *
 * 分隔时可以重复使用字典中的单词。
 * 你可以假设字典中没有重复的单词。
 */
public class Main {
    public static void main(String[] args) {
        String s = "catsanddog";
        String[] strings = {"cat", "cats", "and", "sand", "dog"};
        List<String> list = new ArrayList<String>(Arrays.asList(strings));
        Solution01 solution01 = new Solution01();
        solution01.wordBreak(s, list);
    }
}
