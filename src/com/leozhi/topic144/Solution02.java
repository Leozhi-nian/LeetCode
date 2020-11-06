package com.leozhi.topic144;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 递归
 * 通过
 * 0ms
 */
public class Solution02 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traverse(root, res);
        return res;
    }

    private void traverse(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        traverse(root.left, res);
        traverse(root.right, res);
    }
}
