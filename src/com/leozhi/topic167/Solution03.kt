package com.leozhi.topic167

/**
 * @author leozhi
 * 左右指针
 * 通过
 * 220ms
 */
class Solution03 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1
        while (left < right) {
            when {
                numbers[left] + numbers[right] == target -> {
                    return intArrayOf(left + 1, right + 1)
                }
                numbers[left] + numbers[right] < target -> {
                    left++
                }
                numbers[left] + numbers[right] > target -> {
                    right--
                }
            }
        }
        return intArrayOf(left + 1, right + 1)
    }
}