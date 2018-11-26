package com.lit.codewars

fun people(busStops: Array<Pair<Int, Int>>) = busStops.sumBy { it.first - it.second }