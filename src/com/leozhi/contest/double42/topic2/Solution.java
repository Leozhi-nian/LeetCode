package com.leozhi.contest.double42.topic2;

/**
 * @author leozhi
 */
public class Solution {
    public double averageWaitingTime(int[][] customers) {
        int len = customers.length, time = customers[0][1];
        customers[0][1] += customers[0][0];
        for (int i = 1; i < len; i++) {
            if (customers[i][0] <= customers[i - 1][1]) {
                customers[i][1] += customers[i - 1][1];
            } else {
                customers[i][1] += customers[i][0];
            }
            time += (customers[i][1] - customers[i][0]);
        }
        return (double)time / len;
    }
}
