package com.leozhi.topic86;

/**
 * @author leozhi
 * 模拟
 * 通过
 * 1ms
 */
public class Solution01 {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode low = null, lowHead = null, high = null, highHead = null;
        while (head != null) {
            if (head.val < x) {
                if (low == null) {
                    low = new ListNode(head.val);
                    lowHead = low;
                } else {
                    low.next = new ListNode(head.val);
                    low = low.next;
                }
            } else {
                if (high == null) {
                    high = new ListNode(head.val);
                    highHead = high;
                } else {
                    high.next = new ListNode(head.val);
                    high = high.next;
                }
            }
            head = head.next;
        }
        if (lowHead == null) {
            return highHead;
        }
        low.next = highHead;
        return lowHead;
    }
}
