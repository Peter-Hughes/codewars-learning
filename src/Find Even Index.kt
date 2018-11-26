package com.lit.codewars

fun findEvenIndex(arr: IntArray): Int {
    arr.forEachIndexed { index, _ ->
        when (arr.copyOfRange(0, index).sum()) {
            arr.copyOfRange(index +1, arr.size).sum() -> return index
        }
    }

    return 0
}