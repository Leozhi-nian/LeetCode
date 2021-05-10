package com.leozhi.topic881

import com.leozhi.testcase.array.convertToString
import com.leozhi.testcase.array.createIntArray

/**
 * @author leozhi
 * 贪心算法 + 双指针
 * 通过
 * 412ms
 */
class Solution01 {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        val len = people.size
        var left = 0
        var right = len - 1
        var res = 0
        people.sort()
        while (left <= right) {
            while (right > left && people[left] + people[right] > limit) {
                --right
                ++res
            }
            ++res
            ++left
            --right
        }
        return res
    }
}

fun main() {
    createIntArray(50000, 30000, 1).convertToString().let(::println)
}