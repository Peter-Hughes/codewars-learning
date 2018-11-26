package com.lit.codewars

fun crap(x: Array<CharArray>, bags: Int, cap: Int): String {
    val garden =  x.map { it.map { c -> c } }.flatten().filter { it == '@' || it == 'D' }

    return when {
        garden.contains('D') -> "Dog!!"
        garden.size <= bags * cap -> "Clean"
        else -> "Cr@p"
    }
}