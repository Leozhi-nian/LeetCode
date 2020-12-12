package com.leozhi.topic206;

/**
 * @author leozhi
 * 递归
 * 通过
 * 0ms
 */
public class Solution03 {
    public ListNode reverseList(ListNode head) {
        // 示例：1 -> 2 -> null
        if (head == null || head.next == null) {
            return head;
        }
        // 反转后的头节点，如示例中递归到节点 2 后将其返回作为反转后的头节点
        ListNode reverseHead = reverseList(head.next);
        // 生成局部环形链表，如示例生成环形链表为 1 -> 2 -> 1 -> 2 -> 1 ...
        head.next.next = head;
        // 断开环形链表，如示例为断开 1 -> 2 之间的链，2 -> 1 之间的链仍保留
        head.next = null;
        // 返回，上例返回值为 2 -> 1
        return reverseHead;
    }
}
