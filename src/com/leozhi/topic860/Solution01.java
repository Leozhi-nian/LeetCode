package com.leozhi.topic860;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 3ms
 */
public class Solution01 {
    public boolean lemonadeChange(int[] bills) {
        int[] banknote = new int[2];
        for (int bill : bills) {
            if (bill == 5) {
                ++banknote[0];
            } else if (bill == 10) {
                --banknote[0];
                ++banknote[1];
            } else if (bill == 20) {
                --banknote[0];
                if (banknote[1] > 0) {
                    --banknote[1];
                } else {
                    banknote[0] -= 2;
                }
            }
            if (banknote[0] < 0 || banknote[1] < 0) {
                return false;
            }
        }
        return true;
    }
}
