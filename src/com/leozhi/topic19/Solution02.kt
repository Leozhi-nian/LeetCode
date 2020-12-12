package com.leozhi.topic19

/**
 * @author leozhi
 * 快慢指针
 * 通过
 * 188ms
 */
class Solution02 {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if (head!!.next == null) {
            return null
        }
        var fast = head
        var slow = head
        for (i in 0 until n) {
            fast = fast!!.next
        }
        if (fast == null) {
            return head.next
        }
        while (fast!!.next != null) {
            fast = fast.next
            slow = slow!!.next
        }
        slow!!.next = slow.next.next
        return head
    }
}