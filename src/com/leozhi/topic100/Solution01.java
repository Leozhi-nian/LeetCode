package com.leozhi.topic100;

/**
 * @author leozhi
 * 递归
 * 通过
 * 0ms
 */
public class Solution01 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return judge(p, q);
    }

    private boolean judge(TreeNode root1, TreeNode root2) {
        if (root1 != null && root2 != null) {
            boolean left = judge(root1.left, root2.left);
            boolean right = judge(root1.right, root2.right);
            return left && right && root1.val == root2.val;
        } else {
            return root1 == null && root2 == null;
        }
    }
}
