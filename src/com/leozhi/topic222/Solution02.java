package com.leozhi.topic222;

/**
 * @author leozhi
 * 递归
 * 通过 0ms
 */
public class Solution02 {
    public int countNodes(TreeNode root) {
        int res = 0;
        if (root == null) {
            return res;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return 1 + left + right;
    }
}
