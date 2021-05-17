package com.leozhi.topic404

import com.leozhi.testcase.array.convertToString
import com.leozhi.testcase.array.createIntArray

/**
 * @author leozhi
 * 递归
 * 通过
 * 184ms
 */
class Solution01 {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        if (root == null) return 0
        return findLeftLeave(root, false)
    }

    private fun findLeftLeave(root: TreeNode, isLeft: Boolean): Int {
        if (root.left == null && root.right == null && isLeft) {
            return root.`val`
        }
        var res = 0
        root.left?.let { res += findLeftLeave(it, true) }
        root.right?.let { res += findLeftLeave(it, false) }
        return res
    }
}

fun main() {
    val convertToString = createIntArray(3000, 1000, -1000).convertToString().let(::println)
}