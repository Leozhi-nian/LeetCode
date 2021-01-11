package com.leozhi.topic1721;

/**
 * @author leozhi
 * 两次遍历
 * 通过
 * 3ms
 */
public class Solution01 {
    public ListNode swapNodes(ListNode head, int k) {
        if (head.next == null) {
            return head;
        }
        int len = 0;
        ListNode node = head;
        ListNode left = head, right;
        while (node != null) {
            ++len;
            if (len < k) {
                left = left.next;
            }
            node = node.next;
        }
        right = head;
        for (int i = 0; i < len - k; i++) {
            right = right.next;
        }
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        return head;
    }
}
