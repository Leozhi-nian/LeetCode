package com.leozhi.topic110

import kotlin.math.abs
import kotlin.math.max

/**
 * @author leozhi
 * 递归
 * 通过
 * 232ms
 */
class Solution01 {
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true
        val left = root.left?.let { getDepth(it, 1) } ?: 0
        val right = root.right?.let { getDepth(it, 1) } ?: 0
        return left.shr(5) == 0 && right.shr(5) == 0 && abs(left - right) <= 1
    }

    private fun getDepth(root: TreeNode, depth: Int): Int {
        if (root.left == null && root.right == null) {
            return depth
        }
        val left = root.left?.let { getDepth(it, depth + 1) } ?: depth
        val right = root.right?.let { getDepth(it, depth + 1) } ?: depth
        return if (abs(left - right) > 1) 1.shl(5) + max(left, right) else max(left, right)
    }
}