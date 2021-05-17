package com.leozhi.topic993

/**
 * @author leozhi
 * 递归
 * 通过
 * 212ms
 */
class Solution01 {
    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        val xFather = findFather(root, x, 0)
        val yFather = findFather(root, y, 0)
        return xFather?.second == yFather?.second && xFather?.first != yFather?.first
    }

    private fun findFather(node: TreeNode?, target: Int, d: Int): Pair<TreeNode, Int>? {
        if (node == null) return null
        val res1 = node.left?.let {
            if (it.`val` == target) return Pair(node, d) else findFather(node.left, target, d + 1)
        }
        val res2 = node.right?.let {
            if (it.`val` == target) return Pair(node, d) else findFather(node.right, target, d + 1)
        }
        return res1 ?: res2
    }
}