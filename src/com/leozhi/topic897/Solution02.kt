package com.leozhi.topic897

/**
 * @author leozhi
 * 递归
 * 通过
 * 200ms
 */
class Solution02 {
    val inorder = ArrayList<Int>()
    fun increasingBST(root: TreeNode?): TreeNode? {
        inorder(root)
        val dummy = TreeNode(0)
        inorder.fold(dummy) { node, item ->
            node.right = TreeNode(item)
            node.right!!
        }
        return dummy.right
    }

    private fun inorder(root: TreeNode?) {
        if (root == null) {
            return
        }
        inorder(root.left)
        inorder.add(root.`val`)
        inorder(root.right)
    }
}