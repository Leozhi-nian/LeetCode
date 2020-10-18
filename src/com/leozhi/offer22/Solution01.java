package com.leozhi.offer22;

/**
 * @author leozhi
 * 快慢指针
 * 通过
 * 0ms
 */
public class Solution01 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head, slow = head;
        while (k-- > 0) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
