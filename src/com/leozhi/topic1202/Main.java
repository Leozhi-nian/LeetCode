package com.leozhi.topic1202;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 1202. 交换字符串中的元素
 * 给你一个字符串 s，以及该字符串中的一些「索引对」数组 pairs，其中 pairs[i] = [a, b] 表示字符串中的两个索引（编号从 0 开始）。
 *
 * 你可以 任意多次交换 在 pairs 中任意一对索引处的字符。
 *
 * 返回在经过若干次交换后，s 可以变成的按字典序最小的字符串。
 */
public class Main {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> interval1 = new ArrayList<>();
        interval1.add(0);
        interval1.add(3);
        list.add(interval1);
        List<Integer> interval2 = new ArrayList<>();
        interval2.add(1);
        interval2.add(2);
        list.add(interval2);
        List<Integer> interval3 = new ArrayList<>();
        interval3.add(0);
        interval3.add(2);
        list.add(interval3);
        Solution01 solution = new Solution01();
        solution.smallestStringWithSwaps("dcab", list);
    }
}
