package com.leozhi.topic237

/**
 * @author leozhi
 * 与下一节点交换
 * 通过
 * 212ms
 */
class Solution02 {
    fun deleteNode(node: ListNode?) {
        node?.`val` = node?.next!!.`val`
        node.next = node.next!!.next
    }
}