package com.leozhi.topic61

import createListNode

/**
 * @author leozhi
 * 61. 旋转链表
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 */
fun main() {
    val listNode = "[1,2,3,4,5]".createListNode()
    Solution02().rotateRight(listNode, 2)
}