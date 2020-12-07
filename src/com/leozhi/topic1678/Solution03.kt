package com.leozhi.topic1678

/**
 * @author leozhi
 * 模拟
 * 通过
 * 164ms
 */
class Solution03 {
    fun interpret(command: String): String {
        val len = command.length
        var index = 0
        val stringBuilder = StringBuilder()
        while (index < len) {
            if (command[index] == 'G') {
                stringBuilder.append("G")
                ++index
            } else if (command[index] == '(' && command[index + 1] == ')') {
                stringBuilder.append("o")
                index += 2
            } else {
                stringBuilder.append("al")
                index += 4
            }
        }
        return stringBuilder.toString()
    }
}