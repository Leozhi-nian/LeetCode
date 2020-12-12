package com.leozhi.topic206;

/**
 * @author leozhi
 * 206. 反转链表
 * 反转一个单链表。
 */
public class Main {
    public static void main(String[] args) {
        Solution03 solution = new Solution03();
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head.next = node2;
        node2.next = node3;
        solution.reverseList(head);
    }
}
