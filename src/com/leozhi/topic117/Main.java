package com.leozhi.topic117;

/**
 * @author leozhi
 * 117. 填充每个节点的下一个右侧节点指针 II
 * 给定一个二叉树
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
 *
 * 进阶：
 *
 * 你只能使用常量级额外空间。
 * 使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。
 */
public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(3, null, new Node(6, null, new Node(8, null, null, null), null), null);
        Node node2 = new Node(2, new Node(4, new Node(7, null, null, null), null, null), new Node(5, null, null, null), null);
        Node node = new Node(1, node2, node1, null);
        Solution01 solution = new Solution01();
        solution.connect(node);
    }
}
