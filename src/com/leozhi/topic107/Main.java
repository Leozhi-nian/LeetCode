package com.leozhi.topic107;

/**
 * @author leozhi
 * 107. 二叉树的层次遍历 II
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 */
public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(15);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(20);
        node3.left = node1;
        node3.right = node2;
        TreeNode node4 = new TreeNode(9);
        TreeNode node5 = new TreeNode(3);
        node5.left = node4;
        node5.right = node3;
        Solution02 solution = new Solution02();
        solution.levelOrderBottom(node5);
    }
}
