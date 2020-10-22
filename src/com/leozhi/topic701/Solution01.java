package com.leozhi.topic701;

/**
 * @author leozhi
 * 递归
 * 通过
 * 0ms
 */
public class Solution01 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insert(root, val);
    }

    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (root.val > val) {
            TreeNode node = insert(root.left, val);
            if (root.left == null) {
                root.left = node;
            }
        } else {
            TreeNode node = insert(root.right, val);
            if (root.right == null) {
                root.right = node;
            }
        }
        return root;
    }
}
