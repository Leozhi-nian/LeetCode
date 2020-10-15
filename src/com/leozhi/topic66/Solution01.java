package com.leozhi.topic66;

/**
 * @author leozhi
 */
public class Solution01 {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 2; i >= 0; i--) {
            int carry = 0;
            if (digits[i + 1] >= 10) {
                digits[i + 1] %= 10;
                carry = 1;
            }
            digits[i] += carry;
        }
        if (digits[0] == 10) {
            digits[0] = 0;
            int[] temp = new int[digits.length + 1];
            temp[0] = 1;
            System.arraycopy(digits, 0, temp, 1, temp.length - 1);
            digits = temp;
        }
        return digits;
    }
}
