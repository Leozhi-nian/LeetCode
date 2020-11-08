package com.leozhi.topic106;

/**
 * @author leozhi
 * 106. 从中序与后序遍历序列构造二叉树
 * 根据一棵树的中序遍历与后序遍历构造二叉树。
 *
 * 注意:
 * 你可以假设树中没有重复的元素。
 */
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(15);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(20);
        treeNode3.left = treeNode1;
        treeNode3.right = treeNode2;
        TreeNode treeNode4 = new TreeNode(9);
        TreeNode treeNode5 = new TreeNode(3);
        treeNode5.left = treeNode4;
        treeNode5.right = treeNode3;
        Solution01 solution = new Solution01();
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        solution.buildTree(inorder, postorder);
    }
}
