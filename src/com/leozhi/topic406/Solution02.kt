package com.leozhi.topic406

import kotlin.Comparator

/**
 * @author leozhi
 * 贪心算法
 * 通过
 * 316ms
 */
class Solution02 {
    fun reconstructQueue(people:Array<IntArray>): Array<IntArray> {
        people.sortWith(Comparator { o1, o2 -> if (o1[0] == o2[0]) o1[1] - o2[1] else o2[0] - o1[0] })
        val list = mutableListOf<IntArray>()
        for (p in people) {
            list.add(p[1], p)
        }
        return list.toTypedArray()
    }
}