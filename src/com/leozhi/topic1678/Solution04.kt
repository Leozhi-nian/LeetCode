package com.leozhi.topic1678

/**
 * @author leozhi
 * 正则表达式
 * 通过
 * 244ms
 */
class Solution04 {
    fun interpret(command: String): String {
        var string = command.replace("()", "o")
        string = string.replace("(al)", "al")
        return string
    }
}