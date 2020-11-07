package com.leozhi.topic116;

/**
 * @author leozhi
 * 递归 + 连接两个节点
 * 通过
 * 2ms
 */
public class Solution04 {
    public Node connect(Node root) {
        if (root == null || root.left == null) {
            return root;
        }
        connectTwoNode(root.left, root.right);
        return root;
    }

    void connectTwoNode(Node node1, Node node2) {
        if (node1 == null) {
            return;
        }
        node1.next = node2;
        connectTwoNode(node1.left, node1.right);
        connectTwoNode(node1.right, node2.left);
        connectTwoNode(node2.left, node2.right);
    }
}
