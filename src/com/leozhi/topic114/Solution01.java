package com.leozhi.topic114;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 递归
 * 通过
 * 1ms
 */
public class Solution01 {
    List<Integer> list = new ArrayList<>();
    public void flatten(TreeNode root) {
        traverse(root);
        createLinked(root, 0);
    }
    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
    private void createLinked(TreeNode node, int i) {
        if (i < list.size()) {
            node.left = null;
            node.val = list.get(i);
            if (i < list.size() - 1) {
                node.right = new TreeNode();
            }
            createLinked(node.right, i + 1);
        }
    }
}
