package com.leozhi.topic633;

/**
 * @author leozhi
 * 左右指针
 * 通过
 * 4ms
 */
public class Solution01 {
    public boolean judgeSquareSum(int c) {
        int[] pow = new int[(int)Math.sqrt(c) + 1];
        int i = 0;
        // i * i >= 0 检测是否溢出
        while (i * i <= c && i * i >= 0) {
            pow[i] = i * i;
            i++;
        }
        int left = 0, right = pow.length - 1;
        while (left <= right) {
            if (pow[left] + pow[right] == c) {
                return true;
            } else if (pow[left] + pow[right] < c) {
                left++;
            } else if (pow[left] + pow[right] > c) {
                right--;
            }
        }
        return false;
    }
}
