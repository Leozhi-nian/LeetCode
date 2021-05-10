package com.leozhi.topic872

/**
 * @author leozhi
 * 中序遍历
 * 通过
 * 204ms
 */
class Solution01 {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val leaf1 = ArrayList<Int>()
        val leaf2 = ArrayList<Int>()
        inorder(root1, leaf1)
        inorder(root2, leaf2)
        return leaf1 == leaf2
    }

    fun inorder(root: TreeNode?, leaf: ArrayList<Int>) {
        if (root == null) {
            return
        }
        inorder(root.left, leaf)
        if (root.left == null && root.right == null) {
            leaf.add(root.`val`)
        }
        inorder(root.right, leaf)
    }
}