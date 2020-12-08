package com.leozhi.topic99;

/**
 * @author leozhi
 * 递归
 * 通过
 * 2ms
 */
public class Solution02 {
    private TreeNode s = null, t = null, prev = null;
    public void recoverTree(TreeNode root) {
        traverse(root);
        int temp = s.val;
        s.val = t.val;
        t.val = temp;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        if (prev != null && root.val < prev.val) {
            s = s == null ? prev : s;
            t = root;
        }
        prev = root;
        traverse(root.right);
    }
}
