package com.leozhi.topic111;

/**
 * @author leozhi
 * 深度优先搜索
 * 通过
 * 10ms
 */
public class Solution02 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 计算左子树最小深度
        int left = minDepth(root.left);
        // 计算右子树最小深度
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }
}
