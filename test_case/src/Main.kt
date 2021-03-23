/**
 * @author leozhi
 */
fun main() {
    for (num in "[2, 7, 11,15]".toIntArray()) {
        println(num)
    }

    createIntArray(100).let(::println)

    createString(100, 'a'..'z', 'A'..'Z', '0'..'9').let(::println)
}