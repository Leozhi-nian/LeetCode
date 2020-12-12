package com.leozhi.topic206

/**
 * @author leozhi
 * 递归
 * 通过
 * 204ms
 */
class Solution04 {
    fun reverseList(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }
        val reverseHead = reverseList(head.next)
        head.next.next = head
        head.next = null
        return reverseHead
    }
}