package com.leozhi.topic783;

/**
 * @author leozhi
 * Morris 遍历
 * 通过
 * 0ms
 */
public class Solution01 {
    public int minDiffInBST(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        int pre = Integer.MIN_VALUE;

        TreeNode cur = root;
        TreeNode mostRight;
        while (cur != null) {
            mostRight = cur.left;
            if (mostRight != null) {
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
            if (cur.val - pre < ans && pre != Integer.MIN_VALUE) {
                ans = cur.val - pre;
            }
            pre = cur.val;
            cur = cur.right;
        }
        return ans;
    }
}
