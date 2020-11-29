package com.leozhi.topic976;

import com.leozhi.testcase.array.IntegerArray;

/**
 * @author leozhi
 * 976. 三角形的最大周长
 * 给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
 *
 * 如果不能形成任何面积不为零的三角形，返回 0。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        System.out.println(IntegerArray.getArrayString(IntegerArray.createArray(10000, 1, 1000000)));
        solution.largestPerimeter(new int[]{2,6,2,5,4,15,1});
    }
}
