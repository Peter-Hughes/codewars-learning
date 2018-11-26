package com.lit.codewars

fun high(str: String) : String {
    val se = str.split(" ").map{ s -> s.map{ it.toInt() - 96 }.sum()}
    return str.split(" ")[se.indexOf(se.max())]
}


