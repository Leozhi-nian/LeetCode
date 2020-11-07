package com.leozhi.topic116;

/**
 * @author leozhi
 * 使用已建立的 next 指针
 * 官方题解
 * 通过
 * 0ms
 */
public class Solution02 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Node mostLeft = root;

        while (mostLeft.left != null) {
            mostLeft.left.next = mostLeft.right;
            mostLeft = mostLeft.left;
            if (mostLeft.left != null) {
                Node node = mostLeft;
                while (node.next != null) {
                    node.next.left.next = node.next.right;
                    node.right.next = node.next.left;
                    node = node.next;
                }
            }
        }
        return root;
    }
}
