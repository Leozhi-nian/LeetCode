package com.leozhi.topic234;

/**
 * @author leozhi
 * 234. 回文链表
 * 请判断一个链表是否为回文链表。
 */
public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(-129);
        ListNode node2 = new ListNode(-129);
        node1.next = node2;
        Solution01 solution01 = new Solution01();
        solution01.isPalindrome(node1);
    }
}
