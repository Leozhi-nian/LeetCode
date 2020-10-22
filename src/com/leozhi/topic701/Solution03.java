package com.leozhi.topic701;

/**
 * @author leozhi
 * 递归
 * 通过
 * 0ms
 */
public class Solution03 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
