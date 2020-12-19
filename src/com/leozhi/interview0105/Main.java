package com.leozhi.interview0105;

/**
 * @author leozhi
 * 面试题 01.05. 一次编辑
 * 字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        solution.oneEditAway("pale", "pal");
    }
}
