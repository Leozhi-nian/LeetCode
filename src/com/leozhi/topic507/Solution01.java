package com.leozhi.topic507;

/**
 * @author leozhi
 * 枚举
 * 通过
 * 1ms
 */
public class Solution01 {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}
