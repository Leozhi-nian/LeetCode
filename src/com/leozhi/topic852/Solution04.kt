package com.leozhi.topic852

/**
 * @author leozhi
 * 二分查找
 * 通过
 * 288ms
 */
class Solution04 {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var left = 0
        var right = arr.size - 1
        while (left < right) {
            val mid = left + (right - left) / 2
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left
    }
}