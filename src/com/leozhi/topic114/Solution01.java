package com.leozhi.topic114;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leozhi
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
        for (Integer integer : list) {
            System.out.println(integer);
        }
        if (node != null) {
            node.left = null;
            node.val = list.get(i);
            if (node.right != null) {
                createLinked(node.right, i + 1);
            } else {
                createLinked(new TreeNode(), i + 1);
            }
        }
    }
}
