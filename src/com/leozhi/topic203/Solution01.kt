package com.leozhi.topic203

/**
 * @author leozhi
 * 双指针
 * 通过
 * 248ms
 */
class Solution01 {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        if (head == null) return head
        val dummy = ListNode(0)
        dummy.next = head
        var fast = dummy.next
        var slow: ListNode? = dummy
        while (fast != null) {
            if (fast.`val` == `val`) slow?.next = fast.next else slow = slow?.next
            fast = fast.next
        }
        return dummy.next
    }
}