package com.leozhi.topic88

/**
 * @author leozhi
 * 合并后排序
 * 通过
 * 212ms
 */
class Solution04 {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var j = m
        for (i in 0 until n) {
            nums1[j] = nums2[i]
            j++
        }
        nums1.sort()
    }
}