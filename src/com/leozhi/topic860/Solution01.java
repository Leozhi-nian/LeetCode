package com.leozhi.topic860;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 3ms
 */
public class Solution01 {
    public boolean lemonadeChange(int[] bills) {
        int[] backnote = new int[2];
        for (int bill : bills) {
            if (bill == 5) {
                ++backnote[0];
            } else if (bill == 10) {
                --backnote[0];
                ++backnote[1];
            } else if (bill == 20) {
                --backnote[0];
                if (backnote[1] > 0) {
                    --backnote[1];
                } else {
                    backnote[0] -= 2;
                }
            }
            if (backnote[0] < 0 || backnote[1] < 0) {
                return false;
            }
        }
        return true;
    }
}
