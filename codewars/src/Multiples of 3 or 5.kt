fun sumOf3or5(n: Int): Int {
    var x = 0

    (0 until n).forEach {
        when {
            it % 3 == 0 || it % 5 == 0 -> x += it
        }
    }

    return x
}