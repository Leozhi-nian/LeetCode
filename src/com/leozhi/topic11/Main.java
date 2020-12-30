package com.leozhi.topic11;

import com.leozhi.testcase.array.IntegerArray;

/**
 * @author leozhi
 * 11. 盛最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点   (i,   ai) 。在坐标内画 n 条垂直线，垂直线 i   的两个端点分别为   (i,   ai) 和 (i, 0) 。找出其中的两条线，使得它们与   x   轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器。
  */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7});

        System.out.println(IntegerArray.getArrayString(IntegerArray.createArray(30000, 0, 30000)));
    }
}
