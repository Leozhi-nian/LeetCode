package com.leozhi.topic142

/**
 * @author leozhi
 * 快慢指针
 * 通过
 * 120ms
 */
class Solution02 {
    fun detectCycle(head: ListNode?): ListNode? {
        var slow: ListNode? = head
        var fast: ListNode? = head
        do {
            if (fast?.next == null) {
                return null
            }
            fast = fast.next!!.next
            slow = slow!!.next
        } while (fast != slow)
        fast = head
        while (fast != slow) {
            slow = slow!!.next
            fast = fast!!.next
        }
        return fast
    }
}