package com.leozhi.topic83

/**
 * @author leozhi
 * 一次遍历
 * 通过
 * 232ms
 */
class Solution02 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var node = head
        while (node?.next != null) {
            while (node.next != null && node.`val` == node.next.`val`) {
                node.next = node.next.next
            }
            node = node.next
        }
        return head
    }
}