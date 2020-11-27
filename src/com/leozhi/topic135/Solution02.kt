package com.leozhi.topic135

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 276ms
 */
class Solution02 {
    fun candy(ratings: IntArray): Int {
        val len = ratings.size
        if (len < 2) {
            return len
        }
        val candies: Array<Int> = Array(len) { 1 }
        for (index in 1 until len) {
            if (ratings[index] > ratings[index - 1]) {
                candies[index] = candies[index - 1] + 1
            }
        }
        var res = candies[len - 1]
        for (index in len - 2 downTo 0) {
            if (ratings[index] > ratings[index + 1] && candies[index] <= candies[index + 1]) {
                candies[index] = candies[index + 1] + 1;
            }
            res += candies[index]
        }
        return res
    }
}