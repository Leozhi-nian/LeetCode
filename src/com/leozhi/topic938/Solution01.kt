package com.leozhi.topic938

/**
 * @author leozhi
 * 递归 + 中序遍历
 * 通过
 * 412ms
 */
class Solution01 {
    private var res = 0
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        inorder(root, low, high)
        return res
    }

    private fun inorder(root: TreeNode?, low: Int, high: Int) {
        if (root == null) {
            return
        }
        inorder(root.left, low, high)
        if (root.`val` in low..high) {
            res += root.`val`
        }
        inorder(root.right, low, high)
    }
}