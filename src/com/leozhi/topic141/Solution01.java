package com.leozhi.topic141;

/**
 * @author leozhi
 * 快慢指针
 * 通过
 * 0ms
 */
public class Solution01 {
    public boolean hasCycle(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
