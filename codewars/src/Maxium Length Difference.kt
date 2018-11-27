fun mxdiflg(a1: Array<String>, a2: Array<String>): Int {
    if (a1.isEmpty() || a2.isEmpty())
        return -1
    val x = difference(a1, a2)
    val y = difference(a2, a1)

    return if (x >= y) x else y
}

fun difference(a1: Array<String>, a2: Array<String>) = (a1.map { it.length }.max() ?: 0) - (a2.map { it.length }.min() ?: 0)