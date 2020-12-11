package com.leozhi.topic38;

/**
 * @author leozhi
 * 递归
 * 通过
 * 2ms
 */
public class Solution01 {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        // 获取前一个前一项的字符串
        String pre = countAndSay(n - 1);
        int count = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < pre.length(); i++) {
            // 判断连续字符是否相同
            if (i < pre.length() - 1 && pre.charAt(i) == pre.charAt(i + 1)) {
                ++count;
                continue;
            }
            stringBuilder.append(count).append(pre.charAt(i));
            count = 1;
        }
        return stringBuilder.toString();
    }
}
