package com.leozhi.topic61;

/**
 * @author leozhi
 * 形成环形链表
 * 通过
 * 0ms
 */
public class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode tail = head;
        // 链表长度，由于循环判断最后一个节点时， len 没有自增，所以 len 从 1 开始
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        // 将尾节点与头节点相连，形成环形链表
        tail.next = head;
        // k % len 用于计算头节点向左移动 n 圈后还需移动的步数
        // 由于题目要求链表向右移动，所以头节点向右移动的步数为 len - k % len 次
        // 示例：1 -> 2 -> 3 -> 4 右移 21 个位置，结果为 4 -> 1 -> 2 -> 3
        // 移动 21 步要绕环 5 圈，最后再移动 1 步，则头节点向右移动 4 - 1 =  3 步
        for (int i = 0; i < len - k % len; i++) {
            head = head.next;
            tail = tail.next;
        }
        tail.next = null;
        return head;
    }
}
