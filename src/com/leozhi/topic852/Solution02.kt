package com.leozhi.topic852

/**
 * @author leozhi
 * 线性扫描
 * 通过
 * 232ms
 */
class Solution02 {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        for (i in 1 until arr.size) {
            if (arr[i] < arr[i - 1]) {
                return i - 1
            }
        }
        return 0
    }
}