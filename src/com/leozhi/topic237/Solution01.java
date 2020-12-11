package com.leozhi.topic237;

/**
 * @author leozhi
 * 与下一节点交换
 * 通过
 * 0ms
 */
public class Solution01 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
