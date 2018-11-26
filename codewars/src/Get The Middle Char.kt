fun getMiddle(word: String): String {
    val half = (word.length - 1) / 2
    return word.substring(half, word.length - half)
}