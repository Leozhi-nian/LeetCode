package com.leozhi.topic116;

/**
 * @author leozhi
 * 通过
 */
public class Solution02 {
    public Node connect(Node root) {
        if (root == null) {
            return root;
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
