package com.leozhi.topic354

import com.leozhi.testcase.array.toTwoDimensionalArray

/**
 * @author leozhi
 * 354. 俄罗斯套娃信封问题
 * 给定一些标记了宽度和高度的信封，宽度和高度以整数对形式 (w, h) 出现。当另一个信封的宽度和高度都比这个信封大的时候，这个信封就可以放进另一个信封里，如同俄罗斯套娃一样。
 * 请计算最多能有多少个信封能组成一组“俄罗斯套娃”信封（即可以把一个信封放到另一个信封里面）。
 * 说明:
 * 不允许旋转信封。
 */
fun main() {
    val array = "[[5,4],[6,8],[6,7],[2,3]]".toTwoDimensionalArray()
    array.sortWith { o1, o2 ->
        if (o1[0] == o2[0]) {
            o2[1] - o1[1]
        } else {
            o1[0] - o2[0]
        }
    }
    array.forEach {
        it.forEach { num ->
            println(num)
        }
    }
}