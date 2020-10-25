package com.leozhi.topic230;

/**
 * @author leozhi
 * 深度优先搜索 + 递归
 * 通过
 * 0ms
 */
public class Solution02 {
    int countK = 0, value = 0, k = 0;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return value;
    }

    /**
     * 深度优先搜索
     */
    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);
        if (++countK == k) {
            value = root.val;
        }
        dfs(root.right);
    }
}
