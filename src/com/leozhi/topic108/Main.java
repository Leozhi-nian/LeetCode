package com.leozhi.topic108;

import java.util.Arrays;

/**
 * @author leozhi
 * 108. 将有序数组转换为二叉搜索树
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 */
public class Main {
    public static void main(String[] args) {
        int[] src = new int[]{1, 2, 3, 4, 5};
        int newArray[] = Arrays.copyOfRange(src, 0, 2);
        for (int i : newArray) {
            System.out.println(i);
        }
    }
}
