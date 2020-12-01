package com.leozhi.offer56_I

/**
 * @author leozhi
 * 位运算
 * 通过
 * 256ms
 */
class Solution02 {
    fun singleNumbers(nums: IntArray): IntArray {
        val res = IntArray(2)
        var ans = 0
        for (num in nums) {
            ans = ans.xor(num)
        }
        val low = ans.and(-ans)
        for (num in nums) {
            if (num.and(low) == 0) {
                res[0] = res[0].xor(num)
            }
        }
        res[1] = ans.xor(res[0])
        return res
    }
}