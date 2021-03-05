package com.leozhi.topic232

import java.util.*
import kotlin.collections.ArrayList

/**
 * @author leozhi
 * 栈
 * 通过
 * 176ms
 */
class MyQueue() {
    val stack = Stack<Int>()
    fun push(x: Int) {
        val list = ArrayList<Int>()
        while (!stack.empty()) {
            list.add(stack.pop())
        }
        stack.push(x)
        val size = list.size
        for (i in size - 1 downTo 0) {
            stack.push(list[i])
        }
    }

    fun pop(): Int {
        return stack.pop()
    }

    fun peek(): Int {
        return stack.peek()
    }

    fun empty(): Boolean {
        return stack.empty()
    }
}