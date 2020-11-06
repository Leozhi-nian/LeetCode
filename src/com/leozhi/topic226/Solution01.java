package com.leozhi.topic226;

/**
 * @author leozhi
 * 递归
 * 通过
 * 0ms
 */
public class Solution01 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // 当前节点要做的是：翻转左子树和右子树
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        // 递归左子树
        invertTree(root.left);
        // 递归右子树
        invertTree(root.right);
        return root;
    }
}
