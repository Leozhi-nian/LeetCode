package com.leozhi.topic897

/**
 * @author leozhi
 * 递归
 * 通过
 * 168ms
 */
class Solution01 {
    val inorder = ArrayList<Int>()
    fun increasingBST(root: TreeNode?): TreeNode? {
        inorder(root)
        val head = TreeNode(inorder[0])
        var tail:TreeNode? = head
        for (i in 1 until inorder.size) {
            tail?.right = TreeNode(inorder[i])
            tail = tail?.right
        }
        return head
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