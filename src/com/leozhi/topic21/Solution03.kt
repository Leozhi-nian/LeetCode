package com.leozhi.topic21

/**
 * @author leozhi
 * 递归
 * 通过
 * 208ms
 */
class Solution03 {
    private fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        return if (l1 == null || l2 == null) {
            l1 ?: l2
        } else if (l1.`val` < l2.`val`) {
            l1.next = mergeTwoLists(l1.next, l2)
            l1
        } else {
            l2.next = mergeTwoLists(l1, l2.next)
            l2
        }
    }
}