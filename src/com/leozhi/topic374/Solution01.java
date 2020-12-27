package com.leozhi.topic374;

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 0ms
 */
public class Solution01 extends GuessGame {
    public int guessNumber(int n) {
        int left = 0, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            switch (guess(mid)) {
                case -1:
                    right = mid;
                    break;
                case 1:
                    left = mid + 1;
                    break;
                case 0:
                    return mid;
            }
        }
        return 0;
    }
}