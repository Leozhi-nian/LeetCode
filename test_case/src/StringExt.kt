/**
 * @author leozhi
 */
fun String.toIntList(): List<Int> {
    return try {
        replace("\\s".toRegex(), "").run {
            subSequence(1, length - 1).split(",").map {
                it.toInt()
            }
        }
    } catch (e: Exception) {
        e.printStackTrace()
        emptyList()
    }
}

fun String.toIntArray(): IntArray {
    return toIntList().toIntArray()
}