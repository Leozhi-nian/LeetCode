package com.leozhi.topic94;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 递归
 *
 */
public class Solution02 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
