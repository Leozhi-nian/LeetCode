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

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun String.createListNode(): ListNode? {
    val list = try {
        replace("\\s".toRegex(), "").run {
            subSequence(1, length - 1).split(",")
        }
    } catch (e: Exception) {
        e.printStackTrace()
        emptyList()
    }

    val head = if (!list.isNullOrEmpty()) {
        ListNode(list[0].toInt())
    } else {
        null
    }
    var node = head
    for (i in 1 until list.size) {
        node?.next = ListNode(list[i].toInt())
        node = node?.next
    }
    return head
}