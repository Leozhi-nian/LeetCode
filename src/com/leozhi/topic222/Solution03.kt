package com.leozhi.topic222

/**
 * @author leozhi
 * 递归
 * 通过
 * 252ms
 */
class Solution03 {
    private fun countNodes(root: TreeNode?): Int {
        val res = 0
        if (root == null) {
            return res
        }
        val left = countNodes(root.left)
        val right = countNodes(root.right)
        return 1 + left + right
    }
}