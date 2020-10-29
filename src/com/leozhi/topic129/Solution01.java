package com.leozhi.topic129;

/**
 * @author leozhi
 * 深度优先搜索
 * 通过
 * 0ms
 */
public class Solution01 {
    public int sumNumbers(TreeNode root) {
        return recursion(root, 0);
    }

    public int recursion(TreeNode root, int res) {
        if (root == null) {
            return 0;
        }
        res = res * 10 + root.val;
        if (root.left == null && root.right == null) {
            return res;
        }
        int left = recursion(root.left, res);
        int right = recursion(root.right, res);
        return left + right;
    }
}
