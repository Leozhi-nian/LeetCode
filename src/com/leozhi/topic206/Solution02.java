package com.leozhi.topic206;

/**
 * @author leozhi
 * 迭代
 * 通过
 * 0ms
 */
public class Solution02 {
    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode curNode = head;
        ListNode reverseHead = null;
        while (curNode != null) {
            ListNode nextNode = curNode.next;
            if (nextNode == null) {
                reverseHead = curNode;
            }
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }
        return reverseHead;
    }
}
