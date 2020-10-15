package com.leozhi.topic24;

/**
 * @author leozhi
 * 递归
 * 通过
 */
public class Solution01 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}
