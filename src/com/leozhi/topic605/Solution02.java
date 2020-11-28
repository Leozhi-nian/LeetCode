package com.leozhi.topic605;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 1ms
 */
public class Solution02 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int len = flowerbed.length;
        for (int i = 0; i < len; i++) {
            boolean left = i == 0 || flowerbed[i - 1] == 0;
            boolean right = i == len - 1 || flowerbed[i + 1] == 0;
            if (flowerbed[i] == 0 && left && right) {
                flowerbed[i] = 1;
                n--;
                if (n <= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
