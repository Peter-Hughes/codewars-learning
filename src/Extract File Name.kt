package com.lit.codewars

fun extractFileName(file: String) = file.substringAfter("_").substringBeforeLast(".")