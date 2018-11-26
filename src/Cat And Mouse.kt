package com.lit.codewars

fun catAndMouse(s: String) = if (s.count { it == '.' } <= 3) "Caught!" else "Escaped!"