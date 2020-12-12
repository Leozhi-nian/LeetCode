package com.leozhi.topic234

/**
 * @author leozhi
 * 集合 + 左右指针
 * 通过
 * 256ms
 */
class Solution02 {
    fun isPalindrome(head: ListNode?): Boolean {
        val list = ArrayList<Int>()
        var node = head
        while (node != null) {
            list.add(node.`val`)
            node = node.next
        }
        var left = 0
        var right = list.size - 1
        while (left < right) {
            if (list.get(left) != list.get(right)) {
                return false
            }
            ++left
            --right
        }
        return true
    }
}