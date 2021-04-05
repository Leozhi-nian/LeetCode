package com.leozhi.topic112

/**
 * @author leozhi
 * 递归
 * 官方题解
 * 通过
 * 220ms
 */
class Solution01 {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) {
            return false
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.`val`
        }
        return hasPathSum(root.left, targetSum - root.`val`) || hasPathSum(root.right, targetSum - root.`val`)
    }
}