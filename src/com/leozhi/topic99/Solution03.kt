package com.leozhi.topic99

/**
 * @author leozhi
 * 递归
 * 通过
 * 264ms
 */
class Solution03 {
    var s: TreeNode? = null
    var t: TreeNode? = null
    var prev: TreeNode? = null
    fun recoverTree(root: TreeNode?) {
        traverse(root)
        val temp = s?.`val`
        s?.`val` = t?.`val`!!
        if (temp != null) {
            t!!.`val` = temp
        }

    }

    fun traverse(root: TreeNode?) {
        if (root == null) {
            return
        }
        traverse(root.left)
        if (prev != null && root.`val` < prev!!.`val`) {
            s = if (s == null) prev else s
            t = root
        }
        prev = root
        traverse(root.right)
    }
}