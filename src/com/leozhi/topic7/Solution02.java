package com.leozhi.topic7;

/**
 * @author leozhi
 * 数值类型提升机制检查溢出
 * 通过
 * 0ms
 */
public class Solution02 {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            // 判断是否溢出
            if ((rev * 10) / 10 != rev) {
                return 0;
            }
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }
}
