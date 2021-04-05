package com.leozhi.topic88

/**
 * @author leozhi
 * 逆向双指针
 * 通过
 * 196ms
 */
class Solution08 {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var i = m
        var j = n
        var pos = i-- + j-- - 1
        while (i >= 0 && j >= 0) {
            nums1[pos--] = if (nums1[i] > nums2[j]) nums1[i--] else nums2[j--]
        }
        while (j >= 0) {
            nums1[pos--] = nums2[j--]
        }
    }
}