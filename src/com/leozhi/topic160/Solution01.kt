package com.leozhi.topic160

/**
 * @author leozhi
 * 双指针
 * 通过
 * 216ms
 */
class Solution01 {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        var tail = headA
        while (tail?.next != null) {
            tail = tail.next
        }
        tail?.next = headB
        var slow = headA
        var fast = headA
        while (fast?.next != null) {
            fast = fast.next?.next
            slow = slow?.next
            if (slow == fast) break
        }
        fast = headA
        while (fast != slow) {
            slow = slow?.next
            fast = fast?.next
        }
        tail?.next = null
        return fast
    }
}