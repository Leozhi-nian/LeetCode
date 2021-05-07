package com.leozhi.nowcoder.enterprise.nc78

/**
 * @author leozhi
 * 递归
 * 通过
 * 85ms
 */
object Solution01 {
    fun ReverseList(head: ListNode?): ListNode?  {
        // 思路：从头节点向后移动（递归调用栈入栈），直至移动至尾节点后，将尾节点设为反转后的头节点
        // 紧接着从尾节点向前移动（递归调用栈出栈），head.next.next = head 表示将两个节点进行双向连接
        // 接着 head.next = null 表示将原本的正向连接删除
        if (head?.next == null) {
            return head
        }
        val reverseHead = ReverseList(head.next)
        head.next!!.next = head
        head.next = null
        return reverseHead
    }
}