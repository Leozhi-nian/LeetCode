package com.leozhi.topic978

/**
 * @author leozhi
 * 滑动窗口
 * 通过
 * 388ms
 */
class Solution01 {
    fun maxTurbulenceSize(arr: IntArray): Int {
        var res = 0
        val size = arr.size
        var left = 0
        var right = 0

        while (right < size - 1) {
            if (left == right) {
                if (arr[left] == arr[left + 1]) {
                    ++left
                }
                ++right
            } else {
                if (arr[right - 1] < arr[right] && arr[right] > arr[right + 1]) {
                    ++right
                } else if (arr[right - 1] > arr[right] && arr[right] < arr[right + 1]) {
                    ++right
                } else {
                    left = right
                }
            }
            res = if (res > right - left + 1) res else right - left + 1
        }
        return res
    }
}