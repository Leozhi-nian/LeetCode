package com.leozhi.topic141

/**
 * @author leozhi
 * 快慢指针
 * 通过
 * 224ms
 */
class Solution02 {
    fun hasCycle(head: ListNode?): Boolean {
        var fast = head
        var slow = head
        while (fast?.next != null) {
            fast = fast.next.next
            slow = slow!!.next
            if (slow == fast) {
                return true
            }
        }
        return false
    }
}