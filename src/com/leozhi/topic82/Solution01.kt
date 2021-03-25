package com.leozhi.topic82

/**
 * @author leozhi
 * 暴力枚举
 * 通过
 * 232ms
 */
class Solution01 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        val repeatingElem = HashSet<Int>()
        var node = head
        while (node?.next != null) {
            if (node.`val` == node.next!!.`val`) {
                repeatingElem.add(node.`val`)
            }
            node = node.next
        }
        val dummy = ListNode(0)
        dummy.next = head
        node = dummy
        while (node?.next != null) {
            if (repeatingElem.contains(node.next!!.`val`)) {
                node.next = node.next!!.next
            } else {
                node = node.next
            }
        }
        return dummy.next
    }
}