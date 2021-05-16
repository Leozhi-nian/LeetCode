package com.leozhi.topic421

/**
 * @author leozhi
 * 字典树
 * 通过
 * 396ms
 */
class Solution04 {
    inner class Node {
        val nodes = Array<Node?>(2) { null }
    }

    val root = Node()

    fun add(x: Int) {
        var p = root
        for (i in 31 downTo 0) {
            val u = (x.shr(i)).and(1)
            if (p.nodes[u] == null) {
                p.nodes[u] = Node()
            }
            p = p.nodes[u]!!
        }
    }

    private fun getVal(x: Int): Int {
        var ans = 0
        var p = root
        for (i in 31 downTo 0) {
            val a = (x.shr(i)).and(1)
            val b = 1 - a
            if (p.nodes[b] != null) {
                ans = (b.shl(i)).or(ans)
                p = p.nodes[b]!!
            } else {
                ans = (a.shl(i)).or(ans)
                p = p.nodes[a]!!
            }
        }
        return ans
    }

    fun findMaximumXOR(nums: IntArray): Int {
        var ans = 0
        for (num in nums) {
            add(num)
            getVal(num).let {
                ans = if (it.xor(num) > ans) it.xor(num) else ans
            }
        }
        return ans
    }
}

fun main() {
    val solution = Solution04()
    solution.findMaximumXOR(intArrayOf(3,10,5,25,2,8))
}