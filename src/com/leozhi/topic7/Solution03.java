package com.leozhi.topic7;

/**
 * @author leozhi
 * 字符串 + 双指针
 * 通过
 * 3ms
 */
public class Solution03 {
    public int reverse(int x) {
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        int left, right = str.length() - 1;
        if (x < 0) {
            left = 1;
        } else {
            left = 0;
        }
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        str = String.valueOf(chars);
        long l = Long.parseLong(str);
        if(l < Integer.MIN_VALUE || l > Integer.MAX_VALUE){
            return 0;
        }
        return (int)l;
    }
}
