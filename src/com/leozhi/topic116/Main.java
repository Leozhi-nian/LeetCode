package com.leozhi.topic116;

/**
 * @author leozhi
 * 116. 填充每个节点的下一个右侧节点指针
 * 给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 *
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 *
 * 初始状态下，所有 next 指针都被设置为 NULL。
 */
public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(3, new Node(6), new Node(7), null);
        Node node2 = new Node(2, new Node(4), new Node(5), null);
        Node node = new Node(1, node2, node1, null);
        Solution01 solution01 = new Solution01();
        solution01.connect(node);
    }
}
