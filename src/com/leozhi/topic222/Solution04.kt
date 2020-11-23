package com.leozhi.topic222

/**
 * @author leozhi
 * 递归
 * 通过
 * 220ms
 */
class Solution04 {
    private fun countNodes(root: TreeNode?): Int {
        root ?: return 0
        val leftHeight = getHeight(root.left)
        val rightHeight = getHeight(root.right)
        if (leftHeight == rightHeight) {
            return getCount(root.left, 1) + 1 + countNodes(root.right)
        }
        return 1 + getCount(root.right, 1) + countNodes(root.left)
    }

    private fun getCount(root: TreeNode?, depth: Int): Int {
        root ?: return 0
        return depth + getCount(root.left, depth * 2)
    }

    private fun getHeight(root: TreeNode?): Int {
        root ?: return 0
        return 1 + getHeight(root.left)
    }
}