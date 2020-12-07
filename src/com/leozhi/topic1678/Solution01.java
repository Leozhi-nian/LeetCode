package com.leozhi.topic1678;

/**
 * @author leozhi
 * 模拟
 * 通过
 * 0ms
 */
public class Solution01 {
    public String interpret(String command) {
        int len = command.length(), index = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (index < len) {
            if (command.charAt(index) == 'G') {
                stringBuilder.append("G");
                ++index;
            } else if (command.charAt(index) == '(') {
                if (command.charAt(index + 1) == ')') {
                    stringBuilder.append("o");
                    index += 2;
                } else {
                    stringBuilder.append("al");
                    index += 4;
                }
            }
        }
        return stringBuilder.toString();
    }
}
