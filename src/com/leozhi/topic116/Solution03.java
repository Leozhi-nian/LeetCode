package com.leozhi.topic116;

/**
 * @author leozhi
 */
public class Solution03 {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        if (root.left != null) {
            root.left.next = root.right;
            root.right.next = root.next != null ? root.next.left : null;
            connect(root.left);
            connect(root.right);
        }
        return root;
    }
}
