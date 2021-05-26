package com.leozhi.topic1190

import java.util.*

/**
 * @author leozhi
 * 栈
 * 通过
 * 200ms
 */
class Solution01 {
    fun reverseParentheses(s: String): String {
        val stack = LinkedList<String>()
        val stringBuilder = StringBuilder()
        val len = s.length
        for (i in 0 until len) {
            val ch = s[i]
            if (ch == '(') {
                stack.push(stringBuilder.toString())
                stringBuilder.setLength(0)
            } else if (ch == ')') {
                stringBuilder.reverse()
                stringBuilder.insert(0, stack.pop())
            } else {
                stringBuilder.append(ch)
            }
        }
        return stringBuilder.toString()
    }
}