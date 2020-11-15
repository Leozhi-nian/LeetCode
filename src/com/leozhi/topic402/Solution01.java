package com.leozhi.topic402;

/**
 * @author leozhi
 * 暴力
 * 失败
 * 超出时间限制
 */
public class Solution01 {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if (len == k) {
            return "0";
        }
        StringBuilder numStringBuilder = new StringBuilder(num);
        String res = num;
        for (int i = 0; i < k; i++) {
            len = res.length();
            for (int j = 0; j < len; j++) {
                numStringBuilder = new StringBuilder(num);
                String replace = numStringBuilder.replace(j, j + 1, "").toString();
                if (replace.compareTo(res) < 0) {
                    res = replace;
                }
            }
            num = res;
        }
        int i;
        for (i = 0; i < res.length(); i++) {
            if (res.charAt(i) != '0') {
                break;
            }
        }
        return "".equals(res.substring(i)) ? "0" : res.substring(i);
    }
}
