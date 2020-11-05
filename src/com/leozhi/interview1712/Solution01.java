package com.leozhi.interview1712;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
 * 递归
 * 通过
 * 4ms
 */
public class Solution01 {
    List<Integer> list = new ArrayList<>();
    public TreeNode convertBiNode(TreeNode root) {
        traverse(root);
        transform(root, 0);
        return root;
    }

    private void transform(TreeNode node, int i) {
        if (i == list.size()) {
            return;
        }
        if (node != null) {
            node.left = null;
            node.val = list.get(i);
            if (node.right == null && i < list.size() - 1) {
                node.right = new TreeNode(i + 1);
            }
        }
        transform(node.right, i + 1);
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }
}
