package com.leozhi.topic421

/**
 * @author leozhi
 * 逐位字典树
 * 官方题解
 * 通过
 * 684ms
 */
class Solution03 {
    fun findMaximumXOR(nums: IntArray): Int {
        var maxNum = nums[0]
        for (num in nums) {
            maxNum = if (num > maxNum) num else maxNum
        }
        val l = (Integer.toBinaryString(maxNum)).length

        val n = nums.size
        val bitMask = 1.shl(l)
        val strNums = Array(n) { "" }
        for (i in 0 until n) {
            strNums[i] = Integer.toBinaryString(bitMask.or(nums[i])).substring(1)
        }

        val trie = TrieNode()
        var maxXor = 0
        for (num in strNums) {
            var node = trie
            var xorNode = trie
            var curXor = 0
            for (bit in num.toCharArray()) {
                if (node.children.containsKey(bit)) {
                    node = node.children[bit]!!
                } else {
                    val newNode = TrieNode()
                    node.children[bit] = newNode
                    node = newNode
                }

                val toggledBit = if (bit == '1') '0' else '1'
                if (xorNode.children.containsKey(toggledBit)) {
                    curXor = (curXor.shl(1).or(1))
                    xorNode = xorNode.children[toggledBit]!!
                } else {
                    curXor = curXor.shl(1)
                    xorNode = xorNode.children[bit]!!
                }
            }
            maxXor = if (maxXor > curXor) maxXor else curXor
        }
        return maxXor
    }
}

class TrieNode {
    val children = HashMap<Char, TrieNode>()
}