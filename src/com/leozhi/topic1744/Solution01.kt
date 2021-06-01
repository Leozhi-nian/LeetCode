package com.leozhi.topic1744

/**
 * @author leozhi
 * 前缀和
 * 通过
 * 820ms
 */
class Solution01 {
    fun canEat(candiesCount: IntArray, queries: Array<IntArray>): BooleanArray {
        val size = queries.size
        val answer = BooleanArray(size)
        val prefixNum = LongArray(candiesCount.size)
        prefixNum[0] = candiesCount[0].toLong()
        for (i in 1 until candiesCount.size) {
            prefixNum[i] = prefixNum[i - 1] + candiesCount[i]
        }
        for (i in 0 until size) {
            answer[i] = canEat(prefixNum, queries[i][0], queries[i][1], queries[i][2])
        }
        return answer
    }

    private fun canEat(prefixNum: LongArray, favoriteType: Int, favoriteDay: Int, dailyCap: Int): Boolean {
        val minDay = if (favoriteType > 0) prefixNum[favoriteType - 1] / dailyCap else 0
        val maxDay = prefixNum[favoriteType] - 1
        return favoriteDay in minDay..maxDay
    }
}