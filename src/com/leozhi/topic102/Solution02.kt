package com.leozhi.topic102

import java.util.*
import kotlin.collections.ArrayList

/**
 * @author leozhi
 * 广度优先搜索
 * 通过
 * 216ms
 */
class Solution02 {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val res: MutableList<List<Int>> = ArrayList()
        if (root == null) {
            return res
        }
        val queue: Queue<TreeNode> = LinkedList()
        queue.offer(root)
        while (!queue.isEmpty()) {
            val len = queue.size
            val list: MutableList<Int> = ArrayList()
            for (i in 0 until len) {
                val node: TreeNode = queue.poll()
                list.add(node.`val`)
                if (node.left != null) {
                    queue.offer(node.left)
                }
                if (node.right != null) {
                    queue.offer(node.right)
                }
            }
            res.add(list)
        }
        return res
    }
}