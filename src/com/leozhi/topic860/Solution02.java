package com.leozhi.topic860;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 2ms
 */
public class Solution02 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                ++five;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                --five;
                ++ten;
            } else if (bill == 20) {
                if (five > 0 && ten > 0) {
                    --ten;
                    --five;
                } else {
                    if (five < 3) {
                        return false;
                    }
                    five -= 3;
                }
            }
        }
        return true;
    }
}
