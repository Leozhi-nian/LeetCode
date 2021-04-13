package com.leozhi.topic783

/**
 * @author leozhi
 * 递归
 * 通过
 * 204ms
 */
class Solution03 {
    var res = Int.MAX_VALUE
    fun minDiffInBST(root: TreeNode?): Int {
        val list = ArrayList<Int>()
        inorder(root, list)
        return res
    }

    private fun inorder(root: TreeNode?, list: ArrayList<Int>) {
        if (root == null) {
            return
        }
        inorder(root.left, list)
        val diff = if (list.isNotEmpty()) root.`val` - list.last() else Int.MAX_VALUE
        res = if (diff < res) diff else res
        list.add(root.`val`)
        inorder(root.right, list)
    }
}