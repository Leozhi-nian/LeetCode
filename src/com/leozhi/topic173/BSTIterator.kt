package com.leozhi.topic173

/**
 * @author leozhi
 * 中序遍历
 * 通过
 * 304ms
 */
class BSTIterator(root: TreeNode?) {
    val list = ArrayList<Int>()
    var index = 0
    init {
        inorder(root)
    }
    fun next(): Int {
        return list[index++]
    }

    fun hasNext(): Boolean {
        return index != list.size
    }

    private fun inorder(root: TreeNode?) {
        if (root == null) {
            return
        }
        inorder(root.left)
        list.add(root.`val`)
        inorder(root.right)
    }
}