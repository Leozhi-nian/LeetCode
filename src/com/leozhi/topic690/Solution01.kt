package com.leozhi.topic690

/**
 * @author leozhi
 * 递归
 * 通过
 * 308ms
 */
class Solution01 {
    fun getImportance(employees: List<Employee?>, id: Int): Int {
        val map = HashMap<Int, Employee>()
        for (employee in employees) {
            map[employee!!.id] = employee
        }
        return recursion(id, map)
    }

    private fun recursion(id: Int, map: HashMap<Int, Employee>): Int {
        val employee = map[id]
        var res = employee?.importance ?: 0
        for (i in employee!!.subordinates) {
            res += recursion(i, map)
        }
        return res
    }
}