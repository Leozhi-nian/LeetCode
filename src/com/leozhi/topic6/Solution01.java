package com.leozhi.topic6;

/**
 * @author leozhi
 * 未通过
 */
public class Solution01 {
    public String convert(String s, int numRows) {
        int len = s.length(), index = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            index = i;
            while (index < len) {
                sb.append(s.charAt(index));
                if (index % numRows == i || i == 0) {
                    int num = index + (numRows - i - 1) * 2;
                    if (num != index + numRows + 2 && num < len) {
                        sb.append(s.charAt(num));
                    }
                    index = index + numRows + 2;
                } else {
                    index = index + i * 2;
                }
            }
        }
        return sb.toString();
    }
}
