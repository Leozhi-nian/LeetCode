import kotlin.random.Random

/**
 * @author leozhi
 */
fun createIntArray(size: Int, min: Int = 0, max: Int = 100): String {
    val random = Random(System.currentTimeMillis())
    val stringBuilder = StringBuilder()
    stringBuilder.append("[")
    for (i in 0 until size) {
        stringBuilder.append(random.nextInt(max) % (max - min + 1) + min)
        if (i != size - 1) {
            stringBuilder.append(",")
        }
    }
    stringBuilder.append("]")
    return stringBuilder.toString()
}

fun createString(length: Int, vararg range: CharRange): String {
    val random = Random(System.currentTimeMillis())
    val stringBuilder = StringBuilder()
    for (i in 0 until length) {
        val index = random.nextInt(range.size)
        val min = range[index].first.toInt()
        val max = range[index].last.toInt()
        stringBuilder.append((random.nextInt(max) % (max - min + 1) + min).toChar())
    }
    return stringBuilder.toString()
}