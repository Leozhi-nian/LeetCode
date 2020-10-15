package com.leozhi.topic70;

/**
 * @author leozhi
 */
public class Solution02 {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int preview = 1, current = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = preview + current;
            preview = current;
            current = sum;
        }
        return sum;
    }
}
