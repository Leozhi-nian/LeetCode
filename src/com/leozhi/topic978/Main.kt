package com.leozhi.topic978

/**
 * @author leozhi
 * 978. 最长湍流子数组
 * 当 A  的子数组  A[ i], A[i+1], ..., A[ j]  满足下列条件时，我们称其为湍流子数组：
 * 
 * 若  i <= k < j，当 k  为奇数时，  A[ k] > A[k+1]，且当 k 为偶数时，A[ k] < A[k+1]；
 * 或 若  i <= k < j，当 k 为偶数时，A[ k] > A[k+1]  ，且当 k  为奇数时，  A[ k] < A[k+1]。
 * 也就是说，如果比较符号在子数组中的每个相邻元素对之间翻转，则该子数组是湍流子数组。
 * 
 * 返回 A 的最大湍流子数组的长度。
 */
fun main() {
    val solution = Solution01()
    solution.maxTurbulenceSize(intArrayOf(9,4,2,10,7,8,8,1,9))
}