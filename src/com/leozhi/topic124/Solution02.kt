package com.leozhi.topic124

import kotlin.math.max

/**
 * @author leozhi
 * 递归
 * 通过
 * 280ms
 */
class Solution02 {
    var res = Int.MIN_VALUE
    fun maxPathSum(root: TreeNode?): Int {
        traverse(root)
        return res
    }

    fun traverse(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        val left = max(0, traverse(root.left))
        val right = max(0, traverse(root.right))
        res = max(res, root.`val` + left + right)
        return max(left, right) + root.`val`
    }
}