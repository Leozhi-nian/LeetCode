package com.leozhi.topic61

import ListNode

/**
 * @author leozhi
 * 形成环形链表
 * 通过
 * 196ms
 */
class Solution02 {
    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (head == null) {
            return null
        }
        var newHead = head
        var tail = head
        var len = 1
        while (tail?.next != null) {
            tail = tail.next
            ++len
        }
        tail?.next = head
        for (i in 1..len - k % len) {
            newHead = newHead?.next
            tail = tail?.next
        }
        tail?.next = null
        return newHead
    }
}