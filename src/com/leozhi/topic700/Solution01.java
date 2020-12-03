package com.leozhi.topic700;

/**
 * @author leozhi
 * 递归
 * 通过
 * 0ms
 */
public class Solution01 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        }else if (root.val == val) {
            return root;
        } else {
            return searchBST(root.right, val);
        }
    }
}
