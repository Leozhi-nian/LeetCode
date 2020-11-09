package com.leozhi.topic973;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leozhi
 * 排序
 * 通过
 * 32ms
 */
public class Solution01 {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparingInt(o -> (o[0] * o[0] + o[1] * o[1])));
        return Arrays.copyOfRange(points, 0, K);
    }
}
