package com.leozhi.topic530;

/**
 * @author leozhi
 * 通过
 */
public class Solution01 {
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ans = Integer.MAX_VALUE, pre = -1;
        TreeNode cur = root;
        TreeNode mostRight = null;
        while (cur != null) {
            mostRight = cur.left;
            if (mostRight != null) {
                // 获取当前节点左子树最右的节点
                while (mostRight.right != null && mostRight.right != cur) {
                    mostRight = mostRight.right;
                }
                if (mostRight.right == null) {
                    mostRight.right = cur;
                    cur = cur.left;
                    continue;
                } else {
                    mostRight.right = null;
                }
            }
            if (cur.val - pre < ans && pre != -1) {
                ans = cur.val - pre;
            }
            pre = cur.val;
            cur = cur.right;
        }
        return ans;
    }
}
