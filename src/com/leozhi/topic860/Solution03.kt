package com.leozhi.topic860

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 236ms
 */
class Solution03 {
    fun lemonadeChange(bills: IntArray): Boolean {
        var five = 0
        var ten = 0
        for (bill in bills) {
            if (bill == 5) {
                ++five
            } else if (bill == 10) {
                if (five == 0) {
                    return false
                }
                --five
                ++ten
            } else if (bill == 20) {
                if (five > 0 && ten > 0) {
                    --ten
                    --five
                } else {
                    if (five < 3) {
                        return false
                    }
                    five -= 3
                }
            }
        }
        return true
    }
}