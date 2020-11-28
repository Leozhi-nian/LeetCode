package com.leozhi.topic605

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 244ms
 */
class Solution03 {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        if (n == 0) {
            return true
        }
        val len = flowerbed.size
        var count = 0
        for (i in 0 until len) {
            val left = i == 0 || flowerbed[i - 1] == 0
            val right = i == len - 1 || flowerbed[i + 1] == 0
            if (flowerbed[i] == 0 && left && right) {
                flowerbed[i] = 1
                count++
                if (count == n) {
                    return true
                }
            }
        }
        return false
    }
}