package com.leozhi.topic204

/**
 * @author leozhi
 * 埃氏筛
 * 通过
 * 260ms
 */
class Solution03 {
    fun countPrimes(n: Int): Int {
        var res = 0
        val nums = Array(n + 1) { 0 }
        nums.fill(0)
        var i = 2
        while (i < n) {
            if (nums[i] == 0) {
                ++res;
                var j = i
                while (j <= n) {
                    nums[j] = 1
                    j += i
                }
            }
            ++i
        }
        return res
    }
}