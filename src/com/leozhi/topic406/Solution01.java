package com.leozhi.topic406;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leozhi
 * 贪心算法
 * 通过 9ms
 */
public class Solution01 {
    public int[][] reconstructQueue(int[][] people) {
        // 排序：身高由低到高，前方与自己身高相同或比自己高的人数由小到大
        // [7,0], [7,1], [6,1], [5,0], [5,2], [4,4]
        // 再一个一个插入。
        // [7,0]
        // [7,0], [7,1]
        // [7,0], [6,1], [7,1]
        // [5,0], [7,0], [6,1], [7,1]
        // [5,0], [7,0], [5,2], [6,1], [7,1]
        // [5,0], [7,0], [5,2], [6,1], [4,4], [7,1]

        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        List<int[]> list = new LinkedList<>();
        for (int[] p: people) {
            list.add(p[1], p);
        }
        return list.toArray(new int[0][2]);
    }
}
