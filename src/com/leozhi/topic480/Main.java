package com.leozhi.topic480;

import com.leozhi.testcase.array.IntegerArray;
import com.leozhi.testcase.array.TopLevelKt;

/**
 * @author leozhi
 * 480. 滑动窗口中位数
 * 中位数是有序序列最中间的那个数。如果序列的长度是偶数，则没有最中间的数；此时中位数是最中间的两个数的平均数。
 *
 * 例如：
 *
 * [2,3,4]，中位数是 3
 * [2,3]，中位数是 (2 + 3) / 2 = 2.5
 * 给你一个数组 nums，有一个长度为 k 的窗口从最左端滑动到最右端。窗口中有 k 个数，每次窗口向右移动 1 位。你的任务是找出每次窗口移动后得到的新窗口中元素的中位数，并输出由它们组成的数组。
 */
public class Main {
    public static void main(String[] args) {
        String data = "[1,3,-1,-3,5,3,6,7]";
        int[] array = TopLevelKt.toIntArray(data);
        System.out.println(IntegerArray.getArrayString(IntegerArray.createArray(1000, -100000, 100000)));
        Solution02 solution = new Solution02();
        solution.medianSlidingWindow(array, 3);
    }
}
