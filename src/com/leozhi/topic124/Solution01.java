package com.leozhi.topic124;

/**
 * @author leozhi
 * 递归
 * 通过
 * 1ms
 */
public class Solution01 {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        traverse(root);
        return res;
    }

    private int traverse(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, traverse(root.left));
        int right = Math.max(0, traverse(root.right));
        res = Math.max(res, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
