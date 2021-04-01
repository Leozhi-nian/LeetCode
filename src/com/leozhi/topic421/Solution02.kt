package com.leozhi.topic421

/**
 * @author leozhi
 * 利用哈希集合存储按位前缀
 * 官方题解
 * 通过
 * 460ms
 */
class Solution02 {
    fun findMaximumXOR(nums: IntArray): Int {
        var maxNum = nums[0]
        for (num in nums) {
            maxNum = if (num > maxNum) num else maxNum
        }
        val l = (Integer.toBinaryString(maxNum)).length

        var maxXor = 0
        var curXor: Int
        val prefixes = HashSet<Int>()
        for (i in l - 1 downTo 0) {
            maxXor = maxXor.shl(1)
            curXor = maxXor.or(1)
            prefixes.clear()
            for (num in nums) {
                prefixes.add(num.shr(i))
            }
            for (prefix in prefixes) {
                if (prefixes.contains(curXor.xor(prefix))) {
                    maxXor = curXor
                    break
                }
            }
        }
        return maxXor
    }
}