package com.leozhi.topic129;

/**
 * @author leozhi
 * 129. 求根到叶子节点数字之和
 * 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
 *
 * 例如，从根到叶子节点路径 1->2->3 代表数字 123。
 *
 * 计算从根到叶子节点生成的所有数字之和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        Solution01 solution01 = new Solution01();
        solution01.sumNumbers(treeNode);
    }
}
