package com.lit.codewars

fun accum(s: String) = (s.toLowerCase().mapIndexed { index, c ->
    c.toUpperCase() + c.toString().repeat(index)
}.joinToString("-"))