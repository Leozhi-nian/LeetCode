package com.leozhi.topic108

/**
 * @author leozhi
 * 递归
 * 通过
 * 216ms
 */
class Solution02 {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        val len = nums.size
        if (len == 0) {
            return null
        }
        return recursion(0, len, nums)
    }

    private fun recursion(begin: Int, end: Int, nums: IntArray): TreeNode? {
        if (begin == end) {
            return null
        }
        val mid = begin + (end - begin) / 2
        val node = TreeNode(nums[mid])
        node.left = recursion(begin, mid, nums)
        node.right = recursion(mid + 1, end, nums)
        return node
    }
}