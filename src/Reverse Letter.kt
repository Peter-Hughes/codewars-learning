package com.lit.codewars

fun reverseLettersOnly(str: String) = str.filter { it.isLetter() }.reversed()