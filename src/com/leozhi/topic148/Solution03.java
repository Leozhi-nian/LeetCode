package com.leozhi.topic148;

/**
 * @author leozhi
 * 归并排序
 * 通过
 * 6ms
 */
public class Solution03 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 使用双指针找出链表中间节点
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            // 快指针一次前进两个节点，慢指针一次前进一个结点
            // 快指针走到链表末尾时，慢指针位于中点（奇数个节点）或者中间两个节点中的左节点（偶数个节点）
            fast = fast.next.next;
            slow = slow.next;
        }
        // 用于记录右侧节点
        ListNode temp = slow.next;
        // 将链表分为左右两部分
        slow.next = null;
        // 递归
        ListNode left = sortList(head);
        ListNode right = sortList(temp);
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        // 左右两链表均不为空时，将其中头节点较小的插入结果链表
        while (left != null && right != null) {
            if (left.val < right.val) {
                node.next = left;
                left = left.next;
            } else {
                node.next = right;
                right = right.next;
            }
            node = node.next;
        }
        node.next = left != null ? left : right;
        return dummy.next;
    }
}
