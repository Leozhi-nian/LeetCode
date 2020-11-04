package com.leozhi.topic14;

/**
 * @author leozhi
 * 暴力枚举
 * 通过
 * 1ms
 */
public class Solution01 {
    public String longestCommonPrefix(String[] strs) {
        String commonPre;
        if (strs.length != 0) {
            commonPre = strs[0];
        } else {
            return "";
        }
        // 获取最短的字符串作为公共前缀
        for (String s : strs) {
            if (s.length() < commonPre.length()) {
                commonPre = s;
            }
        }
        // 从公共前缀右侧开始遍历所有字符串相应索引处的字符是否和公共前缀相同
        for (int i = commonPre.length() - 1; i >= 0; i--) {
            for (String str : strs) {
                // 不同则排除最后一个字符
                if (str.charAt(i) != commonPre.charAt(i)) {
                    commonPre = commonPre.substring(0, i);
                    break;
                }
            }
        }
        return commonPre;
    }
}
