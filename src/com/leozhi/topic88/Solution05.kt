package com.leozhi.topic88

/**
 * @author leozhi
 * 双指针
 * 通过
 * 212ms
 */
class Solution05 {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var i = m
        var j = n
        var k = i-- + j-- + 1
        while (i >= 0 && j >= 0) {
            nums1[k--] = if(nums1[i] > nums2[j]) nums1[i--] else nums2[j--]
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--]
        }
    }
}