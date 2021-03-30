package com.leozhi.topic187

import createString

/**
 * @author leozhi
 * 187. 重复的DNA序列
 * 所有 DNA 都由一系列缩写为 'A'，'C'，'G' 和 'T' 的核苷酸组成，例如："ACGAATTCCG"。在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。
 * 编写一个函数来找出所有目标子串，目标子串的长度为 10，且在 DNA 字符串 s 中出现次数超过一次。
 */
fun main() {
    println("\"${createString(100000, 'A'..'A', 'C'..'C', 'G'..'G', 'T'..'T')}\"")
}