package com.leozhi.topic845;

/**
 * @author leozhi
 * 845. 数组中的最长山脉
 * 我们把数组 A 中符合下列属性的任意连续子数组 B 称为 “山脉”：
 *
 * B.length >= 3
 * 存在 0 < i < B.length - 1 使得 B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
 * （注意：B 可以是 A 的任意子数组，包括整个数组 A。）
 *
 * 给出一个整数数组 A，返回最长 “山脉” 的长度。
 *
 * 如果不含有 “山脉” 则返回 0。
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,0,2,0,2};
        Solution01 solution01 = new Solution01();
        solution01.longestMountain(array);
    }
}
