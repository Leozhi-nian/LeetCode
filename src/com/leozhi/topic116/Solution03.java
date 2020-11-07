package com.leozhi.topic116;

/**
 * @author leozhi
 * 递归 + 使用已建立的 next 指针
 * 通过
 * 0ms
 */
public class Solution03 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
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
