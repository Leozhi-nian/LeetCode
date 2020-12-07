package com.leozhi.topic1678;

/**
 * @author leozhi
 * 正则表达式
 * 通过
 * 1ms
 */
public class Solution02 {
    public String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}
