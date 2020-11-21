package com.leozhi.topic148;

/**
 * @author leozhi
 * 暴力
 * 失败
 * 超出时间限制
 */
public class Solution01 {
    public ListNode sortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode cur = head;
        while (cur != null) {
            ListNode pre = dummy;
            while (pre.next != null && pre.next.val <= cur.val) {
                pre = pre.next;
            }
            ListNode temp = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            cur = temp;
        }
        return dummy.next;
    }
}
