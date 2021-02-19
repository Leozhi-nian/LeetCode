package com.leozhi.topic1004

import kotlin.math.max

/**
 * @author leozhi
 * 滑动窗口
 * 通过
 * 308ms
 */
class Solution02 {
    fun longestOnes(A: IntArray, K: Int): Int {
        var left = 0
        var right = 0
        var k = K
        while (right < A.size) {
            if (A[right++] == 0) {
                --k
            }
            if (k < 0 && A[left++] == 0) {
                ++k
            }
        }
        return right - left
    }
}