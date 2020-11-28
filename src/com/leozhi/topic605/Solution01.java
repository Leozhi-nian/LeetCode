package com.leozhi.topic605;

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 1ms
 */
public class Solution01 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int len = flowerbed.length;
        if (len == 1) {
            return flowerbed[0] == 0;
        }
        if (len == 2) {
            return n < 2 && flowerbed[0] == 0 && flowerbed[1] == 0;
        }
        int[] newFlowerbed = new int[len + 2];
        System.arraycopy(flowerbed, 0, newFlowerbed, 1, len);
        for (int i = 1; i < len + 1; i++) {
            if (newFlowerbed[i] == 0 && newFlowerbed[i - 1] == 0 && newFlowerbed[i + 1] == 0) {
                newFlowerbed[i] = 1;
                n--;
            }
            if (n <= 0) {
                return true;
            }
        }
        return false;
    }
}
