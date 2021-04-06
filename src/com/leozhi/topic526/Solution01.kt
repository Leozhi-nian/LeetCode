package com.leozhi.topic526

/**
 * @author leozhi
 * 回溯算法
 * 通过
 * 276ms
 */
class Solution01 {
    private var res = 0
    fun countArrangement(n: Int): Int {
        val lists = ArrayList<ArrayList<Int>>(n)
        for (i in 1..n) {
            lists.add(ArrayList())
            for (j in 1..n) {
                if (i % j == 0 || j % i == 0) {
                    lists[i - 1].add(j)
                }
            }
        }
        val set = HashSet<Int>()
        backtrack(n, lists, set)
        return res
    }

    fun backtrack(n: Int, lists: ArrayList<ArrayList<Int>>, track: HashSet<Int>) {
        val len = track.size
        if (len == n) {
            ++res
            return
        }
        for (num in lists[len]) {
            if (track.contains(num)) {
                continue
            }
            track.add(num)
            backtrack(n, lists, track)
            track.remove(num)
        }
    }
}