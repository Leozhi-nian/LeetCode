package com.leozhi.topic514;

/**
 * @author leozhi
 */
public class Solution01 {
    public int findRotateSteps(String ring, String key) {
        int m = ring.length(), n = key.length();
        int[][] steps = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (Math.abs(j - i) > m / 2) {
                    steps[i][j] = m - Math.abs(j - i);
                } else {
                    steps[i][j] = Math.abs(j - i);
                }
            }
        }
        int start, end = 0, step, res = 0;
        for (int i = 0; i < n; i++) {
            step = m;
            start = end;
            for (int j = 0; j < m; j++) {
                if (key.charAt(i) == ring.charAt(j)) {
                    if (steps[start][j] < step) {
                        step = steps[start][j];
                        end = j;
                    }
                }
            }
            res += step + 1;
        }
        return res;
    }
}
