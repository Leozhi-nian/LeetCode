package com.leozhi.topic147;

/**
 * @author leozhi
 * 递归 + 归并排序
 * 通过
 * 1ms
 */
public class Solution03 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        ListNode left = insertionSortList(head);
        ListNode right = insertionSortList(temp);
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
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
        node.next = left == null ? right : left;
        return dummy.next;
    }
}
