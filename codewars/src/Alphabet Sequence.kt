fun alphaSeq(str: String) = str.toLowerCase().asIterable().sorted().joinToString(",") { c ->
    c.toUpperCase() + c.toString().repeat(c.toInt() - 'a'.toInt())
}
