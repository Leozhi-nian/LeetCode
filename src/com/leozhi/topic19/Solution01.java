package com.leozhi.topic19;

/**
 * @author leozhi
 * 快慢指针
 * 通过
 * 0ms
 */
public class Solution01 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 链表只有一个结点时，删除一个结点后，链表为空
        if (head.next == null) {
            return null;
        }
        ListNode fast = head, slow = head;
        // 快指针提前移动 n 步
        while (n-- > 0) {
            fast = fast.next;
        }
        // 当删除倒数最后一个节点，即正数第一个节点时，快指针为空，返回头节点的下一节点
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
