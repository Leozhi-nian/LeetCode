package com.leozhi.topic341

/**
 * @author leozhi
 * 深度优先搜索
 * 官方题解
 * 通过
 * 268ms
 */
class NestedIterator(nestedList: List<NestedInteger>) : Iterator<Int> {
    private val values = ArrayList<Int>()
    val cur by lazy { values.iterator() }

    init {
        dfs(nestedList)
    }

    override fun next(): Int {
        return cur.next()
    }

    override fun hasNext(): Boolean {
        return cur.hasNext()
    }

    private fun dfs(nestedList: List<NestedInteger>) {
        for (nest in nestedList) {
            if (nest.isInteger()) {
                values.add(nest.getInteger()!!)
            } else {
                dfs(nest.getList()!!)
            }
        }
    }
}

abstract class NestedInteger {
    // Constructor initializes an empty nested list.
    constructor()
    // Constructor initializes a single integer.
    constructor(value: Int)
    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    abstract fun isInteger(): Boolean
    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    abstract fun getInteger(): Int?
    // Set this NestedInteger to hold a single integer.
    abstract fun setInteger(value: Int): Unit
    // Set this NestedInteger to hold a nested list and adds a nested integer to it.
    abstract fun add(ni: NestedInteger): Unit
    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    abstract fun getList(): List<NestedInteger>?
}